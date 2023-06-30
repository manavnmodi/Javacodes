package Patterns;
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
public class Pattern9 {
    public static void main(String[] args) {
     printDiamond(5);   
    }
    public static void printDiamond(int n) {
        // Your code here
            for(int i = 1; i <= n; i++){
            for(int j = n-1; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for (int i = n; i >= 1; i--) {
            //this is for space
          for (int j = 0; j < n-i; j++) {
            System.out.print(" ");
          }
          //this is for start print
          for (int j = 1; j <=i ; j++) {
          
                System.out.print("* ");
           
          }
          System.out.println("");
        }
    }
}
