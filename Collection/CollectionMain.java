package com.dajung.java.collection;

import java.util.ArrayList;
import java.util.HashMap;

import com.dajung.java.collection.dummy.Student;

public class CollectionMain {

	public static void main(String[] args) {

		// List 계열 : .add(값)로 값 입력, .get(순서)의 값 출력
    // ArrayList<Integer> list = new ArrayList<>();

		ArrayList<Student> list = new ArrayList<>();
    // 타입에 클래스를 넣어도 됨

		// 향상된 for문으로 student에 있는 값 불러오기
		Student a1 = new Student();
		a1.name = "홍길동";  // 객체 식별자. 하고 어떤 객체든 넣을 수 있음
		a1.age = 500;

		Student a2 = new Student();
		a2.name = "이순신";
		a2.age = 400;

		list.add(a1); // 추가
		list.add(a2);

		for(Student item : list){  // list에서 차례대로 객체를 item에 대입
		System.out.println(item.name + "" + item.age);
		}



//		int a = 33;

//		list.add(457);
  // 자동으로 객체 타입으로 변환, 제네릭을 사용하지 않는 컬렉션은 입력되는 값은 오브젝트로 캐스팅 함
//		list.add(1234);

		// string첫번째 글자 출력하기
//		System.out.println("hi".substring(0, 1));

		// 향상된 for문
//		for (int item : list){
////			String string = item + "";
////			int number = Integer.parseInt(item);  // 숫자
////			System.out.println(string.substring(0, 1)); //문자열
//			System.out.println( item + 3 ); // 숫자에 3 더하기
//		}
		//일반 for문
//		int list_length = list.size();
//
//		for ( int i = 0; i < list_length; i++){
//			System.out.println(list.get(i));
//		}


		// Map 계열
		// (키1 , 값) 의 형태로 저장 됨
		HashMap<String,String> map = new HashMap<>();
		map.put("key1", "홍길동");
		map.put("key2", "이순신");
		System.out.println(map.get("key2"));

		// Set 계열
		// 리스트와 동작 방식이 유사하지만 중복 값을 허용하지 않는다.

	}

}
