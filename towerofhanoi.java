public class towerofHanoi {

    public static void towerofHanoii(int n, String src, String helper, String dest) {
        
        if(n == 1) {
            System.out.println("transfer dish "+ n + " from "+ src + " to "+dest); 
            return;
        }
        towerofHanoii(n-1, src, dest, helper);
        System.out.println("transfer dish "+ n + " from "+ src + " to "+dest);
        towerofHanoii(n-1, helper, src, dest);

    }
    public static void main(String[] args) {
        int n = 4;
        towerofHanoii(n, "S", "H", "D");
    }
}
