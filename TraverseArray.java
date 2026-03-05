import java.util.Scanner;
class TraverseArray{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers :- ");
		int arr[] = new int[5];
		for (int a = 0; a < 5; a++){
			arr[a] = sc.nextInt();
		}
		for (int b = 0; b < 5; b++){
			System.out.print(arr[b]+" ");
		}
		
	}
}