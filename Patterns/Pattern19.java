package Patterns;
public class Pattern19 {
    // **********
    // **** ****
    // *** ***
    // ** **
    // * *
    // * *
    // ** **
    // *** ***
    // **** ****
    // **********
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int n) {

        
        // code here
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= 2 * n - 2 * i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= 2 * n - 2 * i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}