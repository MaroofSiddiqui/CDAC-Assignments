import java.util.Scanner;
class ReverseString{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :- ");
		String word = sc.next();
		for (int i = word.length()-1;i>=0;i--){
			System.out.print(word.charAt(i));
		}
	}
}