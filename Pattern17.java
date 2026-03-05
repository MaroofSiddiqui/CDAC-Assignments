class Pattern17{
	public static void main(String Maroof[]){
		for (int i = 1; i < 6; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(((j*2)-1));
				if (i > j){
					System.out.print("*");
				}else{
					System.out.println();
				}
			}
		} 	
	}
}