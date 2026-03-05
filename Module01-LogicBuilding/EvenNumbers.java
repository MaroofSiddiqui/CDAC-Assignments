import java.util.Scanner;
class EvenNumbers{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = sc.nextInt();
		for (int a = 1; a <= n; a++){
			if (a%2 == 0){
				System.out.print(a+" ");
			}
		}
	}
}