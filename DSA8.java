package Ass3;

import java.util.Arrays;

public class DSA8 {

	public static void main(String[] args) {
		
		int n[] []= {{0,30},{31,33},{32,34}};
		int start=0,end=0,flag=0;

		for(int l=0;l<n.length;l++)
		{
			start=n[l][0];
			end=n[l][1];
			for(int j=0;j<n.length;j++)
			{
				if(l!=j && start>=n[j][0] && start<=n[j][1])
				{
					flag=1;
					break;
				}
			}
		}
		System.out.println(flag==1?false:true);
	}
}
