package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // 가로와 세로 입력 받기
        System.out.print("가로를 입력하세요: ");
        double width = scanner.nextDouble();
        System.out.print("세로를 입력하세요: ");
        double height = scanner.nextDouble();

        // 면적 계산
        double area = width * height;

        // 둘레 계산
        double perimeter = 2 * (width + height);

        // 결과 출력
        System.out.println("사각형의 넓이: " + area);
        System.out.println("사각형의 둘레: " + perimeter);

        scanner.close();

	}

}
