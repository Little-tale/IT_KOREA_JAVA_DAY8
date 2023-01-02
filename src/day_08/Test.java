package day_08;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//5개의 정수를 입력한 뒤 배열에 담고 최대값과 최소값 출력
		// 배열선언란)
		int myNum[] = new int[5] ;
		int msg = 0;
		int max =0, min = 0;
		// 스캐너 선언란)
		Scanner sc = new Scanner(System.in);
		// msg 변수
		// Max 와 MIN 변수 선언
		// 반복문 선언
		min = myNum[0];
		for(int i = 0; i<myNum.length; ++i)
		{
			System.out.print("입력하실 수 입력 : ");
			myNum[i] = sc.nextInt();
			if (max < myNum[i])
			{
				max = myNum[i];
			}
			else if (min > myNum[i]) //&& min < max)
			{
				min = myNum[i];
				System.out.println(min);
			}
			/*
			 * //else { System.err.println("error"); }
			 */
		}
		System.out.println("최소값"+ min );
		System.out.println("최대값"+ max );
			// 입력받는것도 반복문 가능
		// 최댓값 최소값 배열 선언
		// 반복문(조건문)
		// 출력
		

	}

}
