// ____****
// ___****_
// __****__
// _****___
// ****___


public class Starrhombus {
    public static void main(String[] args) {
        int s =5;
        for(int i  = 1; i<=s;i++){
            for(int j = 1; j<=s-i;j++){
                System.out.print("_");
            }
            for(int j =0;j<s;j++){
                System.out.print("*");
            }
            for(int j=1; j<=i-1;j++){
                System.out.print("_");
            }
            System.out.println();
        }
    }
}