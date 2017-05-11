
### 20170511

#### 패키지

- 클래스가 너무 많아져 묶음으로 관리하는 것
- 코드의 맨 위에 위치해야 함
- 패키지가 없으면 자동으로 '기본패키지'에 속한다고 봄
- 접근을 제어하고싶은 메소드를 사용할때 유요 함

###### 패키지 명명 규칙
- 대문자는 사용하지 않는게 좋다
- 파일을 각각 구분하기위해 .을 사용
- 회사 이름이나 혹은 도메인등으로 많이 구별 함
- 도메인을 반대로 기재한 모양으로 설정
1. com.회사이름.프로젝트이름
ex ) com.naver.test
2. com.회사이름.플랫폼.프로젝트이름
ex ) com.naver.java.test

###### 접근 제어
- 접근 제한 : public, private, protected, default
- 접근제한자를 안 쓸경우 패키지가 바뀔 시 해당 클래스, 변수...등을 호출할 수 없음
- public : 모든 접근을 허용
- default : 접근 제한자가 없는 것, 같은 패키지, 클래스..등에서만 사용 가능
- private : 같은 클래스에서만 사용 가능.


#### 생성자

- 인스턴스를 생성할때 호출되는 초기 메소드
```java
Student a1 = new Student();
// 클래스명 이름 = new 클래스명();
a1.name = "홍길동";  
a1.age = 500;
```

###### 생성자의 조건
- 생성자의 이름은 클래스의 이름과 같아야 한다.
- 생성자는 리턴값이 없다. ( 하지만 void를 쓰지 않는다. )

#### 배열
- 하나의 변수로 많은 양의 데이터를 저장
- 서로 다른 타입의 데이터를 하나로 묶어서 다루려면, 클래스를 정의해서 사용
- 첨자는 0부터 시작
- 하나의 자료형 타입만 저장 가능


![enter image description here](http://www.javachobo.com/images/p5_2.gif)

``` java

      int arr[] = new int[10] ;
      int arr2[] = {1,2,3,4,5,};

      for( int a1 : arr){
        System.out.println(a1);
      }
      for( int a1 : arr2){
        System.out.println(a1);
      }

```
#### 컬렉션
- 여러 원소들을 담을 수 있는 자료구조
- 동적배열로 사이즈가 정해져있지 않다
- 하나의 객체로 봄

1. List
- ArrayList<타입> list = new ArrayList<타입생략가능>();
- .add(값)로 값 입력, .get(순서)의 값 출력


2. Map
- HashMap<타입,타입> map = new HashMap<타입생략가능>();
- (키1 , 값) 의 형태로 저장 됨

3. Set
- 리스트와 동작 방식이 유사하지만 중복 값을 허용하지 않는다


![enter image description here](http://sexy.pe.kr/tc/attach/1/3635322689.jpg)

![enter image description here](http://2.bp.blogspot.com/-M0M8nv5s2lQ/U3BcbRQcRvI/AAAAAAAAAec/oBBmQCPDm9Y/s1600/Collection-Classes.tif)

- ArrayList <-> HashMap : 키 값이 있고 없고의 차이 (사용도가 구분 됨)

#### String 클래스 메소드

```java

public class StringMain {

	public static void main(String[] args) {

		String name = "안녕하세요";

		// 문자 지우기
		String secondWord = name.substring(1, 2);		
		System.out.println(secondWord);		

		// 문자 개수
		int 문자길이 = name.length();		
		System.out.println(문자길이);

    // - 몇째에있는 문자를 반환
    char 한글자 = name.charAt(0);
		System.out.println(한글자);

    // 지정한 문자가 몇번째에 있는지 반환
		int 몇번째 = name.indexOf("하세");
		System.out.println(몇번째);

    // 배열로 반환
    String 두덩이[] = name.split("하");
        // '하'를 기준으로 안녕/하세요 두덩이로 나눔
		System.out.println(두덩이[0]);

    // 지정한 문자로 대체
		String 바뀐글 = name.replace("하", "라");
        // 하 -> 라 로 변경
		System.out.println(바뀐글);

	}

}

```
- substring (해당 문자만 출력, 그이후로 출력x)
```java
System.out.println(string.substring(0, 1));
```
- split : 공백문자를 split하게되면 한 글자 단위로 분해해서 배열로 변환 함

#### 제네릭
- 컬렉션 객체의 그 타입만 넣으라고 알려 쥼
- 자료구조가 담을 데이터타입을 분명하게 설정하는 것
-

```java
ArrayList<Integer> list = new ArrayList<>();
// Integer가 예약어이므로 int는 안 됨
```
-------------------------------------------------
###### +++
- NullPoint : 메모리가 new가 아직 안 됨
- 메모리 : 아직 아무것도 할당되지 않았다고 알려주기위해 메모리에 Null이 존재
- 지역변수 = 멤버변수 : 객체를 설계하고 필요한 속성을 나열한 것
- 반환 차입이 있는 함수 설계
```java
 public void functionNoReturn(){}
  ```
- 반환 타입이 있는 함수 설계
```java
 public int functionReturn(){
   int result = 0; //result에 값을 주면 return시 호출 함
   return result;
 }
 ```

 - int <-> Integer

 -> int는
 null로 초기화 x
 산술연산 가능
 윈시 자료형(char,double...)

 -> Integer는
 null로 초기화 가능
 Unboxing을 하지 않으면 산술연산 불가능
 Wrapper 클래스
 객체
 자바 기본형을 클래스화 시킨 것

 **
 boxing : 기본 자료 -> Wrapper클래스로 변환
 Unboxing : Wrapper클래스로 변환 -> 기본자료

 - 클래스 : 변수와 함수의 모음을 정의한 것, 자체가 static
 ex)
 int a = 1;  // 변수(속성)
 public void~~~~ // 함수(기능)
