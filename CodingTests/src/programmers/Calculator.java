package programmers;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * 1. 사용자로부터 ㅋㅣ보드 입력을 받음 
		 * 2. 사용자가 입력한 부호값 확인
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 값 : ");
		int a = scan.nextInt();
		System.out.print("두 번째 값 : ");
		int b = scan.nextInt();
		System.out.print("연산 부호 (+ - * /) : ");
		String operator = scan.next();

		switch (operator) {
		case "+":
			System.out.print(a+ " + " + b +" = "+ (a+b));
			break;
		case "-":
			System.out.print(a+ " - " + b +" = "+ (a-b));
			break;
		case "*":
			System.out.print(a+ " * " + b +" = "+ (a*b));
			break;
		case "/":
			System.out.print(a+ " / " + b +" = "+ (a/b));
			break;
		default:
			System.out.println("인식할 수 없는 연산자입니다. ");
			break;
		}
		scan.close();

	}
}
