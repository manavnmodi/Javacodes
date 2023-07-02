package Patterns;
public class Pattern17 {
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA
    public static void main(String[] args) {
        printTriangle(5);
    }
    public static void printTriangle(int n) {
        // code here
        for (int i = 0; i <n; i++) {



            char ch ='A';
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            ch--;
            for (int j = 0; j < i; j++) {
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
