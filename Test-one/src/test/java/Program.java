
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =50;

		int count=0;
		for (int i=1;i<=50;i++)
		{

		
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
			count++;
			}
		}
		if(count==2)
		{
		System.out.println("prime number:"+i );
		}
		count =0;

		}
	}

}
