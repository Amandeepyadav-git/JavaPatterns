package strParttern;
//To print star square pattern 5x5

public class sqrptrn {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
