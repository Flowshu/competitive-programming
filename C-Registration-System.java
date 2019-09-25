import java.util.Scanner;
import java.util.TreeMap;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        String str;
        for (int d=0; d<c; d++) {
            str = sc.next();
            if(!tmap.containsKey(str)) {
                tmap.put(str, 0);
                System.out.println("OK");
            }
            else {
                tmap.put(str, tmap.get(str)+1);
                System.out.println(str + tmap.get(str));
            }
        }
    }
}