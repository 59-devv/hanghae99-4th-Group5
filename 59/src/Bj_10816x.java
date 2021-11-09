import java.io.*;
import java.util.StringTokenizer;

public class Bj_10816x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int[] nums = new int[num1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num1; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int num2 = Integer.parseInt(st.nextToken());
        int[] nums2 = new int[num2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num2; i++) {
            nums2[i] = Integer.parseInt(st.nextToken());
        }


        int[] counter = new int[nums2.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums[i] == nums2[j]) {
                    counter[j]++;
                }
            }
        }
        for (int c : counter) {
            bw.write(c + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}