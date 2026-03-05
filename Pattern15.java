class Pattern15{
	public static void main(String Maroof[]){
		for (int i = 1; i < 6; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(i);
				if (i > j){
					System.out.print("*");
				}else{
					System.out.println();
				}
			}
		} 
		for (int i = 5; i > 1; i--){
			for (int j = i; j >= 1; j--){
				System.out.print(i);
				if (1 < j){
					System.out.print("*");
				}else{
					System.out.println();
				}
			}
		}
	}
}