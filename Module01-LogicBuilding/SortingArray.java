import java.util.Scanner;
class SortingArray{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers :- ");
		int arr[] = new int[5];
		for (int a = 0; a < 5; a++){
			arr[a] = sc.nextInt();
		}
		int temp;
		for (int a = 0; a < 5; a++){
			for (int b = 0; b < 5-a-1; b++){
				if (arr[b]>arr[b+1]){
					temp = arr[b];
					arr[b] = arr[b+1];
					arr[b+1] = temp;
				}
			}
		}
		
		for (int b = 0; b < 5; b++){
			System.out.print(arr[b]+" ");
		}
		
		
	}
}