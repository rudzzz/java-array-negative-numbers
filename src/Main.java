import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers?");
		int number = scanner.nextInt();
		
		int[] vector = new int[number];
		
		for(int i = 0; i< vector.length; i++) {
			System.out.println("Say a number: ");
			vector[i] = scanner.nextInt();
		}
		
		System.out.println("Negative numbers in the array: ");
		
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] < 0) {
				System.out.println(vector[i]);
			}
		}
		
		scanner.close();
		
	}

}
