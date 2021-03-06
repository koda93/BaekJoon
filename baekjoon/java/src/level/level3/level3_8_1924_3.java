//Baekjoon Online Judge : https://www.acmicpc.net
//Question 1924 : 2007년  
//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 
//이를 알아내는 프로그램을 작성하시오.

package level.level3;

import java.util.Scanner;

public class level3_8_1924_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int day = 0;

		if (x >= 1 && x <= 12 && y >= 1 && y <= 31) {
			for (int i = 1; i <= x; i++) {
				if (i <= 7 && i >= 2) {
					if (i-1 == 2)// 이전 달 기준
						day += 28;
					else if ((i-1) % 2 == 1)// 1,3,5,7
						day += 31;
					else
						day += 30;
				} else if (i >= 8 && i <= 12)
					if(i-1 == 7)// 7
						day += 31;
					else if((i-1) % 2 == 0)// 8,10,12
						day += 31;
					else
						day += 30;
			}

			day = (day + y) % 7;

			switch (day) {
			case 0:
				System.out.println("SUN");
				break;
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			}
		}
	}
}
