class Pattern16{
	public static void main(String Maroof[]){
		for (int i = 1; i < 6; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(j);
				if (i > j){
					System.out.print("*");
				}else{
					System.out.println();
				}
			}
		} 	
	}
}