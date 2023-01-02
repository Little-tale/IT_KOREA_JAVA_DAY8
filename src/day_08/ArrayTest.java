package day_08;

public class ArrayTest
{	public static void main(String[] args)
	{
		int arrayTest[] = {104,97,112,112,121,65};
		
		System.out.println((char)(arrayTest[5]));
		
		for(int i = 0; i <5 ; ++i)
		{
			System.out.print((char)(arrayTest[i]));
			//이게 스트링 원리다.
		}

	}

}
