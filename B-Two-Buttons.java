import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int target = sc.nextInt();
        boolean[] visited = new boolean[Math.max(start * 2, target * 2) + 10];
        Queue<Tuple> qu = new LinkedList<Tuple>();
        qu.add(new Tuple(start, 0));
        while (!qu.isEmpty())  {
            Tuple elem = qu.poll();
            int x = (int) elem.x;
            int spath = (int) elem.y;
            visited[x] = true;
            if (x == target) {
                System.out.println(spath);
                break;
            }
            if ( x * 2 <= target * 2 && visited[x*2] == false) {
                qu.add(new Tuple(x*2,spath + 1));
            }
            if (x - 1 > 0  && visited[x-1] == false) {
                qu.add(new Tuple(x - 1,spath + 1));
            }
        }
    }
    public static class Tuple<X, Y> { 
        public final X x; 
        public final Y y; 
        public Tuple(X x, Y y) { 
            this.x = x; 
            this.y = y; 
        }
    }
}