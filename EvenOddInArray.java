import java.util.Scanner;
class EvenOddInArray{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 numbers :- ");
		int arr[] = new int[5];
		for (int a = 0; a < 5; a++){
			arr[a] = sc.nextInt();
		}
		int pos = 0, neg = 0;
		for (int b = 0; b < 5; b++){
			if (arr[b] > 0){
				pos ++;
			} else if(arr[b] < 0){
				neg ++;
			}
		}
		
		System.out.print("Positive numbers :- "+pos+"\nNegative numbers :- "+neg);
		
		
	}
}