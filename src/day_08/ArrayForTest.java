package day_08;

public class ArrayForTest {

	public static void main(String[] args) {
		//배열에서 향상된 for문(for - each)
		//for(초기식;조건;증감)
		//for(자료형 변순 : 배열) (배열의 값이 있으면 자료형 변수로 값을 보내주고
		// 반복 실행할 문장;
			// 문장이 실행
		//
			//배열의 값이 없으면 종료
		
		int[] score = {88,90,30,100,65};
		int sum = 0; // 정수의 합계을 더해줄 변수
		for (int i : score)
		{
			// 종료 조건과 초기값, 증감식을 숨기고 배열과 면수명만
			// 이용해서 문장을 반복 시키는 방법
			// for each 문이라고 한다
			// 확인해보자
			sum+=i;
		}
		System.out.println("정수합계"+ sum);

	}

}
