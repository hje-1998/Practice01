package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 각 동전별 개수 입력 받기
        System.out.print("500원 개수: ");
        int coin500 = scanner.nextInt();
        System.out.print("100원 개수: ");
        int coin100 = scanner.nextInt();
        System.out.print("50원 개수: ");
        int coin50 = scanner.nextInt();
        System.out.print("10원 개수: ");
        int coin10 = scanner.nextInt();

        // 각 동전별 금액 계산
        int total500 = coin500 * 500;
        int total100 = coin100 * 100;
        int total50 = coin50 * 50;
        int total10 = coin10 * 10;

        // 총 금액 계산
        int totalAmount = total500 + total100 + total50 + total10;

        // 결과 출력
        System.out.println("동전의 총합은 : " + totalAmount + " 원 입니다.");

        scanner.close();
	}
	
}
