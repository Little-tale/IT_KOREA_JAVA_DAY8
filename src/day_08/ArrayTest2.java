package day_08;

public class ArrayTest2 {

	public static void main(String[] args) {
		//배열 선언 후 1부터 10 까지 값을 넣기
		//반복문
		
		//1. 배열선언
		int arData[] = new int [10];
		for (int i = 0; i<10;++i)
		{
			arData[i] = i+1;
			System.out.println("\""+arData[i]+"\""+"번 고객님 입장부탁드립니다.");
		}
		
		// 부터 10까지 값을 배열에 넣고 총 합을 구하시오
		int result= 0;
		for (int i = 0; i<10;++i)
		{
			arData[i] = i+1;
			result += arData[i];
		}
		System.out.println(result);
		// 100~1까지의 값을 배열에 넣고 출력
		
		int arData2[] = new int [101];
		for (int i = 101; i>=1; --i)
		{
			arData2[i] = i-1;
			result += arData2[i];
			System.out.println(arData2[i]);
		}
		
		// 사용자 3병의 자바 점수를 사용자에게 입력받아 배열에 저장하고 평균점수 출력
		
		
		
	}

}
