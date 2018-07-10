package lang;

import java.io.IOException;

public class Pre {

	public static void main(String[] args) {
		//HelloWorld 100만번 출력하는 시간 측정하기
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1000;i=i+1) {
			System.out.println("Hello World");
		}
		long end = System.currentTimeMillis();
		System.out.println("작업시간 : " + (end - start));
		 
		//환경변수 확인
		System.out.println(System.getenv("path"));
		
		//시스템 속성 확인
		System.out.println(System.getProperty("java.version"));
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe https://www.daum.net/"); 
			//앞에는 프로그램 이름이고 뒤에는 열결시키는 매개변수이다. 크롬으로 다음을 열은 것이다 위에는
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
