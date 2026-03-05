class Pattern23{
    public static void main(String Maroof[]){
        int n = 6;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * i - 1); c++){
                System.out.print("*");
            }
            System.out.println();
        }
		for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * i - 1); c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}