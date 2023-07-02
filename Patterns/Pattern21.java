package Patterns;
public class Pattern21 {
// ****
// *  *
// *  *
// ****
    public static void main(String[] args) {
        printSquare(4);
    }

    public static void printSquare(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {

                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
    }
}
