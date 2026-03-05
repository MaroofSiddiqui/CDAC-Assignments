import java.util.Scanner;
class Palindrome{
	public static void main(String Maroof[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String a = sc.next();
		String b= "";
		for (int i = a.length()-1;i>=0;i--){
			b = b + a.charAt(i);
		}
		if(a.equals(b)){
			System.out.print("True");
		} else{
			System.out.print("False");
		}
	}
}