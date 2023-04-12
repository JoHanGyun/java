package test;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int i=1;
		
		System.out.println("숫자 입력:");
		int num=sc.nextInt();
		
		
		while(i<=num) {
			if(i%2==0) {
				System.out.print("-"+i);
				sum-=i;
			}
			else {
				System.out.print("+"+i);
				sum+=i;
			}
			i++;
		}
		
		System.out.print("="+sum);
		
//		for(int i=1;i<=num;i++){
//			if(i%2==0) {
//				System.out.print("-"+i);
//				sum-=i;
//			}
//			else {
//				System.out.print("+"+i);
//				sum+=i;
//			}	
//		}
//		System.out.print("="+sum);
//	
	}

}
