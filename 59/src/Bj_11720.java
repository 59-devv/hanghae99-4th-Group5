import java.io.*;
import java.util.StringTokenizer;

public class Bj_11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken("\n"));
        st = new StringTokenizer(br.readLine());
        String nums = st.nextToken();

        int sum = 0;
        char[] numsChar = nums.toCharArray();
        for (char c : numsChar) {
            sum += Character.getNumericValue(c);
        }
        bw.write(sum + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
