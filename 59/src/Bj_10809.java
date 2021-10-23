import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String strs = st.nextToken();
        char[] chars = strs.toCharArray();
        List<Integer> alphabets = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            alphabets.add(-1);
        }
        for (int j = 0; j < strs.length(); j++) {
            if (alphabets.get(((int)(chars[j]))-97) == -1) {
                alphabets.set(((int)(chars[j]))-97, j);
            }
        }
        for (int a : alphabets) {
            bw.write(a + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
