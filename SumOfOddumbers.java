import java.util.Scanner;
class SumOfOddumbers{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = sc.nextInt();
		int sm = 0;
		for (int a = 1; a <= n; a++){
			if (a%2 != 0){
				sm += a;
			}
		}
		System.out.print(sm);
	}
}