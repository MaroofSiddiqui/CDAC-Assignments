import java.util.Scanner;
class MultipleOfThree{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = sc.nextInt();
		for (int a = 1; a <= n; a++){
			if (a%3 == 0){
			System.out.print(a+" ");
			}
		}
	}
}