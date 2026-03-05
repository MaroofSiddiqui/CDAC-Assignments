import java.util.Scanner;
class Factorial{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = sc.nextInt();
		int fact = 1;
		for (int a = 1; a <= n; a++){
			fact *= a;
		}
		System.out.print(fact);
	}
}