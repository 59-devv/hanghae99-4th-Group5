import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Bj_4673 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> numList = new ArrayList();
        List<Integer> delList = new ArrayList();

        int n = 10000;

        for (int i = 1; i <= n; i++) {
            numList.add(i);
        }

        for (int j = 1; j <= n; j++) {
            int num = j;
            int len = Integer.toString(num).length();
            int plusNum = 0;
            for (int i = 0; i < len; i++) {
                plusNum += Integer.parseInt(Character.toString((Integer.toString(num).charAt(i))));
            }
            num += plusNum;
            delList.add(num);
        }
        numList.removeAll(delList);

        for (int number : numList) {
            bw.write(number + "");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
