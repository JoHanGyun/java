package test;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int i = 0;
		int max = 0;
		
		System.out.println("정수 5개를 입력해주세요.");
		
		while(i<5) {
			System.out.println((i+1)+"번째 정수");
			num[i]=sc.nextInt();
			
			if(max<num[i])
				max=num[i];

			i++;
		}
			
//		for(int i=0;i<5;i++) {
//			System.out.println((i+1)+"번째 정수");
//			num[i]=sc.nextInt();
//			if(max<num[i])
//				max=num[i];
					
//	}
		System.out.println("입력한 값들중 최대값은"+max+"입니다.");

	}
	

}
