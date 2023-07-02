package Patterns;
public class Pattern14 {
// A
// AB
// ABC
// ABCD
// ABCDE
    public static void main(String[] args) {
        printTriangle(5);
    }
    
    public static void printTriangle(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
