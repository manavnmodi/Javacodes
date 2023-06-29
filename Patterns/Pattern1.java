package Patterns;
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

public class Pattern1 {
    public static void main(String[] args) {
            printSquare(5);
    }
    public static void printSquare(int n) {
        // code here
        for(int i=1;i<=n;i++)
        {
            
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}



 