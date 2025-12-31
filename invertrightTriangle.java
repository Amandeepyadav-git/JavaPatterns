//inverted right angle triangle star pattern using java



public class invertrightTriangle {
    public static void main(String[] args) {
        int n =5;
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
