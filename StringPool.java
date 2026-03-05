class StringPool{
	public static void main(String Maroof[]){
		String a = new String("hello");
		String b = a.intern();
		String c = "hello";
		if(c == b){
			System.out.println("Is str2 and str3 pointing to the same object? true");
		} else{
			System.out.println("Is str2 and str3 pointing to the same object? false");
		}
	}
}