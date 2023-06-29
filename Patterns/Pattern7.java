package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    public static void printTriangle(int n) {
        // code here
       for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * i) + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
      
    }
}
