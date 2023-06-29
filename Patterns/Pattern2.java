package Patterns;
// * 
// * * 
// * * * 
// * * * * 
// * * * * *
public class Pattern2 {
    public static void main(String[] args) {
            printTriangle(5);
    }
    public static void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
           
            for (int j = 0; j < i; j++) {
                    System.out.print("* ");
            }
             System.out.println("");
        
        }   
    }
}
