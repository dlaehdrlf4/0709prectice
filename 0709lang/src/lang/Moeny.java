package lang;

import java.util.Scanner;

public class Moeny {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int y = sr.nextInt();
		
		int a = 50000;
		int x = 0;
		int t = 0;
		int b=0;
		int sw = 0;
		b = 50000/y;
		x = a % y;
		
		t = 10000/x;
		int	p = a % y;
		
		System.out.println(x);
		System.out.print(t);
	}

}
