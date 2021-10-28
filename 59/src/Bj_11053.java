import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Bj_11053 {

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
        int[] answer = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j] && answer[j] >= answer[i]) {
                    answer[i] = answer[j] + 1;
                }
            }
        }
        int max = 0;
        for (int a : answer) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}