import java.io.*;
import java.util.StringTokenizer;

public class Bj_2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken("\n"));
        for (int i = 0; i < count; i++) {
            String strs = "";
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken(" "));
            char[] chars = st.nextToken().toCharArray();
            for (char c : chars) {
                for (int j = 0; j < num; j++) {
                    strs+=c;
                }
            }
            bw.write(strs);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
