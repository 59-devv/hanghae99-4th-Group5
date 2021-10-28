import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj_1321 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int orderNo = Integer.parseInt(st.nextToken());
        for (int i = 0; i < orderNo; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            if (order == 1) {
                int number = Integer.parseInt(st.nextToken());
                int count = Integer.parseInt(st.nextToken());
                A[number-1] = A[number-1] + count;
            } else if (order == 2) {
                int sum = 0;
                int target = Integer.parseInt(st.nextToken());
                for (int a = 0; a < A.length; a++) {
                    sum += A[a];
                    if (sum < target && sum + A[a+1] >= target) {
                        bw.write((a+2) + "");
                        bw.newLine();
                    }
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}