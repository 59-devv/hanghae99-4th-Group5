import java.util.*;

public class Bj_2577 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 1;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            num *= a;
        }

        char[] charNum = Integer.toString(num).toCharArray();
        Map<Character, Integer> mapNum = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            mapNum.put(((char) (i + 48)), 0);
        }
        for (char c : charNum) {
            if (mapNum.containsKey(c)) {
                int temp = mapNum.get(c);
                mapNum.remove(c);
                mapNum.put(c, temp + 1);
            } else {
                mapNum.put(c, 1);
            }
        }
        for (int m : mapNum.values()) {
            System.out.println(m);
        }
    }
}
