//      1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 

public class numberpyramind {
    public static void main(String[] args) {
        int n = 5;
        int s = 1;
        for(int i = 1; i<=n;i++){
            for(int j = 0; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(s+" ");
            }
            s++;
            System.out.println();
        }
    }
}