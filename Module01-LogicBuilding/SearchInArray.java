import java.util.Scanner;
class SearchInArray{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers :- ");
		int arr[] = new int[5];
		for (int a = 0; a < 5; a++){
			arr[a] = sc.nextInt();
		}
		System.out.print("Enter number to find :- ");
		int n = sc.nextInt();
		for (int b = 0; b < 5; b++){
			if(arr[b] == n){
					System.out.print("Found");
					break;
			} else if(b == 4){
				System.out.print("Not Found");
			}
		}
		
		
	}
}