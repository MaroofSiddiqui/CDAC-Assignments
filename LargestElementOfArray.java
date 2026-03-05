import java.util.Scanner;
class LargestElementOfArray{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers :- ");
		int arr[] = new int[5];
		for (int a = 0; a < 5; a++){
			arr[a] = sc.nextInt();
		}
		int sm = 0;
		for (int b = 0; b < 5; b++){
			if(arr[b] > sm){
				sm = arr[b];
			}
		}
		
		System.out.print("The largest number is :- "+sm);
		
		
	}
}