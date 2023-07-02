package Patterns;
public class Pattern16 {
// A
// BB
// CCC
// DDDD
// EEEEE
    public static void main(String[] args) {
        printTriangle(5);
    }
   public static void printTriangle(int n) {
        // code here
        char ch='A';
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j<=i ; j++) {
             System.out.print(ch);
           }
        System.out.println();
        ch++;
        }
    }
}
