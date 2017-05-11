package com.dajung.java.array;

public class ArrayMain {

	public static void main(String[] args) {


		//배열
		int arr[] = new int[10] ;
		int arr2[] = {1,2,3,4,5,};

		for( int a1 : arr){
			System.out.println(a1);
		}
		for( int a1 : arr2){
			System.out.println(a1);
		}
		//ArraySub를 new로 10개 생성
		ArraySub subs[] = new ArraySub[10];
		//값을 할당해줘야 함
		subs[0] = new ArraySub();
		subs[1] = new ArraySub();
		subs[2] = new ArraySub();
		subs[3] = new ArraySub();
		subs[4] = new ArraySub();
		subs[5] = new ArraySub();
		subs[6] = new ArraySub();
		subs[7] = new ArraySub();
		subs[8] = new ArraySub();
		subs[9] = new ArraySub();
		// 값이 없을경우 공간만 할당되어있고 값은 없기때문에 콘솔창에서 Nullpoint에러가 뜸
		for( ArraySub sub: subs){
			System.out.println(sub.a);
		}



		// sub파일 불러와서 실행시키기
//		ArraySub sub = new ArraySub();
//		sub.printNumber();


	}
}
