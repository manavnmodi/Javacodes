package Patterns;
public class Pattern18 {
    public static void main(String[] args) {
        printTriangle(5);
    }
     public static void printTriangle(int n) {
        // code here
        for (int i = n; i >0; i--) {
            for (int j = n; j >=i; j--) {
                System.out.print((char)(64+j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
