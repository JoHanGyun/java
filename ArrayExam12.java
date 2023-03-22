package arrayExam;

import java.util.Scanner;

public class ArrayExam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("숫자 입력: ");
			a[i]=sc.nextInt();
		}	
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"]="+a[i]);
	}

}
