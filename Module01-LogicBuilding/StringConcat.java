import java.util.Scanner;
class StringSame{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 strings : ");
		String a = sc.next();
		String b = sc.next();
		String c = a + b;
		if(a == b){
			System.out.println("Is str3 pointing to the same object as a? true");
		} else{
			System.out.println("Is str3 pointing to the same object as a? false");
		}
	}
}