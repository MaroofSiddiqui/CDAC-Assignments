import java.util.Scanner;
class NamesInArray{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4 names :- ");
		String arr[] = new String[4];
		for (int a = 0; a < 4; a++){
			arr[a] = sc.next();
		}
		for (int b = 0; b < 4; b++){
			System.out.println(arr[b]);
		}
		
		
	}
}