//Baekjoon Online Judge : https://www.acmicpc.net
//Question 2438 : 별찍기 - 1  
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

package level.level3;
import java.util.Scanner;

public class level3_4_2438 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n>=1 && n<=100){
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
