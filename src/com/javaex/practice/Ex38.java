package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 총금액 입력 받기
        System.out.print("총금액을 입력하세요: ");
        int totalAmount = scanner.nextInt();

        // 백원 단위 할인을 적용한 지불금액 계산
        int discount = totalAmount % 100;
        int payableAmount = totalAmount - discount;

        // 결과 출력
        System.out.println("실제 지불금액은 " + payableAmount + "원 입니다.");

        scanner.close();

	}

}
