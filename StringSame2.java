import java.util.Scanner;
class StringSame{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 strings : ");
		String a = sc.next();
		String b = sc.next();
		if(a.equals(b)){
			System.out.println("Using .equals() : true");
		} else{
			System.out.println("Using .equals() : false");
		}
		if(a == b){
			System.out.println("Using == : true");
		} else{
			System.out.println("Using == : false");
		}
	}
}