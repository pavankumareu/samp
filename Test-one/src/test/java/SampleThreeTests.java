import java.io.IOException;

public class SampleThreeTests  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="i am an automation tester";
		String newstr ="";
		for(String s:str.split(" "))
		{
			
			newstr+=s.substring(0, 1).toUpperCase()+s.substring(1, s.length())+" ";
		}
		
		System.out.println(newstr);
		
	}
	
}
