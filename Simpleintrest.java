package screen;
import java.util.*;

public class Simpleintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double year, principle;
		float intersted;
	System.out.println("Enter the year");
	year=sc.nextInt();
	intersted=sc.nextFloat();
	double Total_simple_intersted=(year*intersted)/100;
	System.out.println(Total_simple_intersted);
	
	
	}

}
