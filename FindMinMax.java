import java.util.Scanner;
class Data{
  int Min,Max;
}
public class FindMinMax{
  public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int lb=0,ub=n-1;
        Data p=findminmax(a,lb,ub);
        System.out.println("Min = "+p.Min+" Max = "+p.Max);
  }
  public static Data findminmax(int a[],int lb,int ub){
    Data x=new Data();
    Data y=new Data();
    Data z=new Data();
    int n=ub-lb+1;
    if(n==1){
     x.Min=a[lb];
     x.Max=a[lb];
     return x;
    }
    else if(n==2){
     x.Min=(a[lb]<a[ub])? a[lb]:a[ub];
     x.Max=(a[lb]>a[ub])? a[lb]:a[ub];
     return x;
    }
    else{
      int mid=(lb+ub)/2;
      x=findminmax(a,lb,mid);
      y=findminmax(a,mid+1,ub);
      z.Min=(x.Min<y.Min)? x.Min:y.Min;
      z.Max=(x.Max>y.Max)? x.Max:y.Max;
      return z;
    }
  }
 }