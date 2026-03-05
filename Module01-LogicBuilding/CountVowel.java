import java.util.Scanner;
class CountVowel{
	public static void main(String Maroof[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :- ");
		String word = sc.next();
		int count = 0;
		for (int i = 0; i < word.length(); i++){

			switch (word.charAt(i)){

				case 'a': count ++; break;
				case 'A':count ++; break;
				case 'e':count ++; break;
				case 'E':count ++; break;
				case 'i':count ++; break;
				case 'I':count ++; break;
				case 'o':count ++; break;
				case 'O':count ++; break;
				case 'u':count ++; break;
				case 'U':count ++; break;
           }
		}
		 System.out.print("The number of vowels in "+"'"+word+"' is: "+count);
	}
	
}