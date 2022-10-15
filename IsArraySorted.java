package imam.practice;

import java.util.Scanner;

public class IsArraySorted {
	
	public static void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		System.out.print("Enter Array element");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean b=isSorted(arr,size);
		if(b) {
			System.out.print("Sorted");
		}else {
			System.out.print("Unsorted");
		}
		sc.close();
	}

	private static boolean isSorted(int[] arr, int length) {
		// TODO Auto-generated method stub
		if(length==0||length==1) {
			return true;
		}
		if(arr[length-2]>arr[length-1]) {
			return false;
		}
		return isSorted(arr,length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IsArraySorted obj=new IsArraySorted();
		getData();
	}
}
