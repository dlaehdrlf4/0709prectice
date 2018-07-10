package lang;

import java.util.Scanner;

public class Nansu {

	public static void main(String[] args) {
		// 1 - 45까지 중복되지 않는 6개의 정수 저장
		// 데이터를 저장할 배열 생성
		int[] ar = new int[6];
		int size = ar.length; // length = 6
		// 인덱스 변수
		int i, j;
		// 데이터를 입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < size; i = i + 1) {
			try {
				System.out.println("정수 입력 :");
				String temp = sc.nextLine();
				ar[i] = Integer.parseInt(temp);
				// !(ar[i] >=1 && ar[i]<=45)
				// 1-45 시이의 정수가 아닌 경우 다시 입력받도록 만들기
				if (ar[i] < 1 || ar[i] > 45) { // 드모르간 법칙
					System.out.println("1부터 45까지 수를 입력하시오!");
					i = i - 1;
					continue;
				}
				// 이전에 입력된 값들과 비교 - 중복검사
				for (j = 0; j <= i - 1; j = j + 1) {
					// 이전 데이터와 방금 입력받은 데이터가 같으면 반복문 종료
					if (ar[i] == ar[j]) {
						break;
					}
				}
				// 이전 데이터와 방금 입력된 데이터가 동일하면
				if (j != i) { //중간에 나왔냐?
					System.out.println("동일한 데이터는 안됩니다.");
					i = i - 1;
					continue;
				}
			} catch (Exception e) {
				System.out.println("정수를 입력해주세요 : ");
				// 이런 경우 무효화 시키기 위해서
				i = i - 1; // 무효화 할때 뒤로 한번 가게 해준다. 문자가 들어가면 뒤로 빠꾸하고 숫자가 들어 갔을경우 6개가 들어가게 된다.
			}
		}
		// 배열의 전체 데이터 순회
		for (i = 0; i < size; i = i + 1) {
			// 모든 데이터 출력
			System.out.println(ar[i]);
		}
		// 스캐너 객체 닫기
		sc.close();
	}
}
