package day_08;

import java.util.Scanner;

public class Array03 {
public static void main(String[] args) {
	int arJava[] = new int[3];
	Scanner sc = new Scanner(System.in);
	
	String msg ="번 학생의 자바점수";
	int total = 0;
	for (int i = 0 ; i < arJava.length; ++i)
	{
		System.out.println(i+1+msg);
		arJava[i] = sc.nextInt();
		
		
	}
	
	for(int i = 0; i < arJava.length; ++i)
	{
		total += arJava[i];
		//0 = 0+ 첫번째 학생 점수
		//System.out.println(total);
	}
	System.out.println(total);
}
}
