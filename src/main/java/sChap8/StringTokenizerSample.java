package sChap8;

import java.util.StringTokenizer;

public class StringTokenizerSample {
    public static void main(String[] args) {
        StringTokenizerSample sample = new StringTokenizerSample();
        String data ="오늘은 무슨 운동을 할까 ? 운동은 나의 활력소 행복행 ! ";
        sample.parseString(data);
    }
    private void parseString(String data) {
        StringTokenizer st = new StringTokenizer(data);
        while (st.hasMoreElements()) {
            String tempData = st.nextToken();
            System.out.println("["+tempData+"]");
        }
    }
}
