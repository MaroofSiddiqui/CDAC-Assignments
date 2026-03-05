import java.util.Scanner;
class AverageOfArray{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers :- ");
		int arr[] = new int[5];
		for (int a = 0; a < 5; a++){
			arr[a] = sc.nextInt();
		}
		int sm = 0;
		for (int b = 0; b < 5; b++){
			sm += arr[b];
		}
		float avg = sm/5;
		System.out.print("The average of all number is :- "+avg);
		
		
	}
}