import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
    
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("purple", "Power");
        map.put("green", "Time");
        map.put("blue", "Space");
        map.put("orange", "Soul");
        map.put("red", "Reality");
        map.put("yellow", "Mind");
        int n = sc.nextInt();
        ArrayList<String> input = new ArrayList<String>();
        for(int q = 0; q<n; q++) {
            input.add(sc.next());
        }
        System.out.println(6-n);
        for(String str : map.keySet()) {
            if(!input.contains(str)) {
                System.out.println(map.get(str));
            }
        }
    }
}