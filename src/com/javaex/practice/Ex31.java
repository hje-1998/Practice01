package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // 입력 받기: 상품 가격과 받은 돈
        System.out.print("상품가격: ");
        double price = scanner.nextDouble();
        System.out.print("받은돈: ");
        double received = scanner.nextDouble();

        // 부가세 계산 (상품 가격의 10%)
        double vat = price * 0.1;

        // 잔액 계산
        double change = received - price;

        // 결과 출력
        System.out.println("=================================");
        
        System.out.println("부가세: " + vat );
        System.out.println("잔액: " + change );

        scanner.close();
	}
}
