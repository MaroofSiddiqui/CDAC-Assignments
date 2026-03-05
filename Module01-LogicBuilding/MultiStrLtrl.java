class MultiStrLtrl{
	public static void main(String Maroof[]){
		String a = "java";
		String b = "java";
		String c = "java";
		if(a == b && b == c){
			System.out.println("All strings point to the same object: true");
		} else{
			System.out.println("All strings point to the same object: false");
		}
	}
}