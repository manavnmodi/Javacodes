package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        printTriangle(5);
    }
     public static void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1 ;j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
