package Gugudan;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 2단
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for (int i = 1; i< number+1; i++) {
			
			System.out.println( );
			System.out.println( );
			System.out.println( i + "단");
			System.out.println( );
			for(int j = 1; j< 10; j++) {
				
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
		}
	}

}
