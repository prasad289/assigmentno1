package screen;

import java.util.Scanner;



public class GradesofStudent 
{
	 public static void main(String[] args) {
	        int count, i;
	        float totalMarks = 0, percentage;
	        Scanner sc= new Scanner(System.in);

	        System.out.println("Enter Number of Subjects");
	        count = sc.nextInt();

	        System.out.println("Enter Marks of " + count + " Subjects");
	        for (i = 0; i < count; i++) {
	            totalMarks += sc.nextInt();
	        }

	        percentage = (totalMarks / (count * 100)) * 100;

	        switch ((int) percentage / 10) {
	            case 01:
	                System.out.println("Grade : A+");
	                break;
	            case 02:
	            case 03:
	                System.out.println("Grade : A");
	                break;
	            case 04:
	            case 05:
	                System.out.println("Grade : B");
	                break;
	            case 06:
	            case 07:
	                System.out.println("Grade : C");
	                break;
	            default:
	                System.out.println("Grade : D");
	                break;
	        }
	    }
	}

