package Patterns;


// * * * * *
// * * * * 
// * * * 
// * *  
// * 
public class Pattern5 {
    public static void main(String[] args) {
        printTriangle(5);
    }
     public static void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
