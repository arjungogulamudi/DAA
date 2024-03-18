import java.util.*;
public class TSM
{
	static int tsp(int[][] graph, boolean[] v,
				int current, int n,
				int count, int cost, int ans)
	{
		if (count == n && graph[current][0] > 0)
		{
			ans = Math.min(ans, cost + graph[current][0]);
			return ans;
		}
		for (int i = 0; i < n; i++)
		{
			if (v[i] == false && graph[current][i] > 0)
			{
				v[i] = true;
				ans = tsp(graph, v, i, n, count + 1,
						cost + graph[current][i], ans);
				v[i] = false;
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
		int n = 4;
		int[][] graph = {{0, 10, 15, 20},
						{10, 0, 35, 25},
						{15, 35, 0, 30},
						{20, 25, 30, 0}};
		boolean[] v = new boolean[n];
		v[0] = true;
		int ans = Integer.MAX_VALUE;
		ans = tsp(graph, v, 0, n, 1, 0, ans);
		System.out.println("Minimum cost of Travelling Salesman Problem"+ " is: "+ans);
	}
}

