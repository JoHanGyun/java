package test;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int i = 0;
		int max = 0;
		
		System.out.println("���� 5���� �Է����ּ���.");
		
		while(i<5) {
			System.out.println((i+1)+"��° ����");
			num[i]=sc.nextInt();
			
			if(max<num[i])
				max=num[i];

			i++;
		}
			
//		for(int i=0;i<5;i++) {
//			System.out.println((i+1)+"��° ����");
//			num[i]=sc.nextInt();
//			if(max<num[i])
//				max=num[i];
					
//	}
		System.out.println("�Է��� ������ �ִ밪��"+max+"�Դϴ�.");

	}
	

}
