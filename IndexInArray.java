import java.util.Scanner;
class IndexInArray{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers :- ");
		int arr[] = new int[5];
		for (int a = 0; a < 5; a++){
			arr[a] = sc.nextInt();
		}
		System.out.print("Enter number to search :- ");
		int n = sc.nextInt();
		for (int b = 0; b < 5; b++){
			if (arr[b] == n){
				System.out.print("The number "+arr[b]+" is found at index "+b);
				break;
			}else if(b == 4){
				System.out.print("Not Found");
			}
		}
		
	}
}