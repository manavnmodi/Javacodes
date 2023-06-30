package Patterns;
// 1                 1 
// 1 2             2 1 
// 1 2 3         3 2 1 
// 1 2 3 4     4 3 2 1 
// 1 2 3 4 5 5 4 3 2 1 
public class Pattern12 {
    public static void main(String[] args) {
        printTriangle(5);
    }
     public static void printTriangle(int n) {
        // code here
         for(int i=0;i<n;i++){
          
              //left traingle
                for(int j=0;j<=i;j++){
                    System.out.print(j+1+" " );
                }
                //left half spaces
                for(int j=0;j<n-i-1;j++){
                    System.out.print("  ");
                }
                //right half spaces
                for(int j=0;j<n-i-1;j++){
                    System.out.print("  ");
                }
                
                //right triangle
                for(int j=i;j>=0;j--){
                    System.out.print(j+1+" " );
                }
                
            //next line
            System.out.println();
        }
    }
}
