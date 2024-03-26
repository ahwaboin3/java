package chapter24;

import java.util.Arrays;
import java.util.stream.IntStream;

import chapter23.Calculate;

//라이브러리를 가져다 쓰는데 일부분은 내 코드로 커스트마이징해서 
//연계해서 실행시키는 일이 빈번한다
//상속(오버라이딩)와 구현을 통해 했다
//구현 -> 람다식 사용을 할수 있게 업데이트
public class AboutStream {
	public static void main(String[] args) {
		//스트림 - 배열이나 컬렉션을 람다식을 사용할수 있게 만들어 놓은 기능들
		int[] ar= {1,2,3,4,5};
		//배열 ar로부터 스트림 생성
		IntStream stm1=Arrays.stream(ar);
		//filter(매개변수가 인터페이스형 참조 변수 선언 되어 있다)
		//인터페이스형 참조 변수에 참조 시킬수 있는 방법 3가지
		//1.
		//2.
		//3.
		stm1.filter(null);
	}
	public static void filterCopy(Calculate c) {
		
	}
}











