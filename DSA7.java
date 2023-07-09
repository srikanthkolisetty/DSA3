package Ass3;

public class DSA7 {
	
	public static void main(String[] args) {
		
		int n[]= {0,1,3,50,75};
		int lower=0,upper=99;
		for(int i=0;i<n.length;i++)
		{
			
			if(i==0)
			{
				if(Math.abs(lower-n[i])!=1 && Math.abs(lower-n[i])!=0 )
					System.out.println("ranges are ["+(lower+1)+","+(n[i]-1)+"]");
					
			}
			else if(i!=n.length-1 && Math.abs(n[i]-n[i+1])!=1 && Math.abs(n[i]-n[i+1])!=0)
{
				System.out.println("ranges are ["+(n[i]+1)+","+(n[i+1]-1)+"]");
}
			else if(i==n.length-1)
			{
				if(Math.abs(n[i]-upper)!=1)
					System.out.println("ranges are ["+(n[i]+1)+","+(upper)+"]");
			}
			
		}
	}

}
