import java.util.*;

class PrimeNum {
	public static void main(String[] args) {
		int i, num, count;
		Scanner reader = new Scanner(System.in);
		// System.out.println("Enter number :");
		// int num = reader.nextInt();
		for (num = 1; num <= 100; num++) {
			count = 0;
			for (i = 1; i <= num; i++) { // 1<=5 2 <=5
				if (num % i == 0) { // 5 % 1 == 0 5 % 2 == 0 5 % 3 == 0 5 % 4 ==
									// 0 5 % 5 == 0
					count++; // c = 1 c = 2
				}
			}
			if (count == 2)

				System.out.println("prime number is:" + num);

		}
	}
}