import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Bj_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> setArray = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            setArray.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(setArray.size());
    }
}
