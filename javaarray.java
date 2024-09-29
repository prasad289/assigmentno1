package screen;

import java.util.Scanner;

public class javaarray  {
	/*public static void method()
	{
		String[]cities ={"nashik","pune","nagpur","bombay"};
		for(String x:cities) {
			System.out.println(x+"");
		}
	}*/

	
//	for each loop array

	public static void foreach() {
		String[]ss= {"a","e","i","o","u"};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ss.length;i++) {
		 System.out.println("enter the data");//print the data
		 ss[i]=sc.next();
		}
		for(String a: ss) {
			System.out.println(a);
			
		}
		
	}
	

		
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foreach();
		
	}

}
