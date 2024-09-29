package screen;

import java.util.Scanner;


public class jaggedarray {
	public static void jag() {
		int myarray [][]= new int[3][];
		
		myarray[0]=new int[]{1,2,3};
		myarray[1]=new int[]{4,5};
		myarray[2]=new int[]{6,7,8,9};
		System.out.print("two dimensional array");

	for(int i=0;i<myarray.length;i++){
	for(int j=0;j<myarray[i].length;j++) 
	{
		System.out.println(myarray[i][j]+"  ");
	
	}
	}
	
	};
			
	public static void jad2d() {
		Scanner sc=new Scanner(System.in);
		System.out.print("input array row");
		int n =sc.nextInt();
		int arr[][]=new int[n][];
		for(int i=0;i<n;i++) {
			System.out.println("input the no of element in +(i+1)+*row:");
			arr[i]=new int[sc.nextInt()];
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				count++;
		}
		}
		
		System.out.println("input"+count + "array Elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter array element is:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+"");
			}
		}
		
	}			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jag();

	}


}
