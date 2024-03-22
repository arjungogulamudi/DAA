import java.util.*;
public class BinarySearch{
    public static int bsearch(int [] arr,int l, int r, int x){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search element:");
        int x=sc.nextInt();
        int res=bsearch(arr,0,n,x);
        if(res==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("Element found at position:"+res);
        }
    }

}