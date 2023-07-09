package Ass3;

public class DSA6 {

	public static void main(String[] args) {
		
		int n[]= {2,2,1};
		
		
		for(int i=0;i<n.length;i++)
		{
			int count =0;
			for(int j=0;j<n.length;j++)
			{
				if(n[i]==n[j])
					count++;
			}
			if(count ==1)
			{
				System.out.println(n[i]+"is one which occurs only once");
				break;
			}
		}
	}
}
