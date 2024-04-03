import java.util.*;
class first
{
	Scanner sc=new Scanner(System.in);
	int no[]=new int[5];
	first()
	{
		for(int i=0;i<=no.length;i++)
		{
			System.out.println("Enter number:-"+i+"->");
			no[i]=sc.nextInt();
		}	
	}
	class dis extends first
	{
		dis()
		{
			System.out.println("\n display array \n");
			int t=0;
			for(int i=0; i<no.length;i++)
			{
				System.out.println(i+"->number is:"+no[i]);
				t=t+no[i];
			}	
			System.out.println("\n total is:"+t);
		}
	}
}
class s_l
{
	public static void main(String[] args) 
	{
		dis d=new dis();
			
	}
}