import java.io.*;

public class Bj_1065 {

    public static void main(String[] args) throws IOException {

        //연속된 두 수의 차이가 일정한 수를 한수라고 한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        if (num < 100) {
            cnt = num;
        } else {
            cnt = 99;
            for (int k = 100; k <= num; k++) {
                char[] numChar = Integer.toString(k).toCharArray();
                for (int j = 0; j < numChar.length - 2; j++) {
                    int temp = Character.getNumericValue(numChar[j + 1]) - Character.getNumericValue(numChar[j]);
                    int temp2 = Character.getNumericValue(numChar[j + 2]) - Character.getNumericValue(numChar[j + 1]);
                    System.out.println(temp + ", " + temp2);
                    System.out.println("num0 : " + numChar[j] + ", num1 : " + numChar[j+1] + ", num2 : " + numChar[j+2]);
                    System.out.println(temp2 == temp);

                    //1000은 어차피 한수가 아니기 때문에, 깔끔하게 제외한다. (1,000을 계산하기 위해 조건을 더 짜는건 시간/메모리 낭비)
                    if (Integer.toString(k).length() == 3 && temp2 == temp) {
                        cnt++;
                    }
                }
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
