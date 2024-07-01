package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 연필의 총 개수 입력 받기
        System.out.print("전체 연필갯수를 입력해주세요: ");
        int totalPencils = scanner.nextInt();

        // 인원 수 입력 받기
        System.out.print("전체 인원수를 입력해주세요: ");
        int totalPersons = scanner.nextInt();

        // 1인당 받을 수 있는 연필의 개수 계산
        int pencilsPerPerson = totalPencils / totalPersons;

        // 남는 연필의 개수(나머지) 계산
        int remainder = totalPencils % totalPersons;

        // 결과 출력
        System.out.println("1인당 연필의 갯수는 " + pencilsPerPerson + " 입니다.");
        System.out.println("연필의 나머지 갯수는 " + remainder + " 입니다.");

        scanner.close();

	}

}
