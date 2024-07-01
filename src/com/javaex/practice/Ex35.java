package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {
		
		// 빛의 속도 (km/s)
        final long LIGHT_SPEED_KM_PER_SEC = 300000;

        // 1년 동안의 초 수 계산
        long secondsPerYear = 365 * 24 * 60 * 60; // 1년은 365일, 1일은 24시간, 1시간은 60분, 1분은 60초

        // 빛이 1년 동안 진행하는 거리 계산 (km)
        long distance = LIGHT_SPEED_KM_PER_SEC * secondsPerYear;

        // 결과 출력
        System.out.println("빛이 1년 동안 가는 거리는 " + distance + " km 입니다.");

	}

}
