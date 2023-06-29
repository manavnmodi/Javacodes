package Patterns;

public class Pattern8 {
// *********
//  *******
//   *****
//    ***
//     *

    public static void main(String[] args) {
        printTriangle(5);
    }
    public static void printTriangle(int n) {
        // code here
        //this is for rows
        
        for (int i = n; i > 0; i--) {
            //this is for space
          for (int j = 0; j < n-i; j++) {
            System.out.print(" ");
          }
          //this is for start print
          for (int j = 0; j <(2*i)-1 ; j++) {
          
                System.out.print("*");
           
          }
          System.out.println("");
        }
    }
}
