package com.dajung.java.fibonacci;

public class FibonacciSub {

	public int a=0;  //처음 값
	public int b=1;  //두번째 값


	public void progress(int n){  //프로그램을 실행시킬 수 있는 함수가 있어야 함!
// static을 쓰면 main 에서 FibonacciSub.progress(100)으로 실행 가능하나,메모리를 너무 많이 쓰기때문에 사용하지 않음.
// new 로 하게되면 안쓰는 메모리는 삭제.


		// 배열로 하는 법
//		int result[] = new int [100];
//		int result_index = 2;
//		result[0] = a;
//		result[1] = b;


		System.out.println(a);
//		System.out.println(b);

//		 while문으로 작성했을때
		while(a+b <= n){
			int c = a+b; //c 저장소
			System.out.println(c);
			a = b;
			b = c;
		}

		// for문으로 작성했을때
//		for(int c = a+b; c < n;){  // ;이 있으면 수식 넣기 가능
//
//			System.out.println(c);  // 여기까지는a=0, b=1, a+b=1
//			c = a+b; // 한번찍고 증감을 하기위해 출력 밑에다가 작성
//			a = b;
//			b = c;
//		}

	}


}
