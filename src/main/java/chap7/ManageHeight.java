package chap7;

public class ManageHeight {
    int[][] gradeHeights;

    public void setData() {
         //1차원 배열 크기만 지정, 2차원 지정 안 함
        gradeHeights=new int[5][];
        //여기서 2차원 배열의 크기가 들어오는 data수만큼 자동 지정
        gradeHeights[0]=new int[]{170,180,173,175,177};
        gradeHeights[1]=new int[]{160,165,167,186};
        gradeHeights[2]=new int[]{158,177,187,176};
        gradeHeights[3]=new int[]{173,182,181};
        gradeHeights[4]=new int[]{170,180,165,177,172};
    }

    public void printHeight(int classNo) {
        System.out.println("Class No." + classNo);
        //배열을 위한 for 루프
        for (int data : gradeHeights[classNo - 1]) {
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double average;
        double sum = 0.0;
            System.out.println("Class No." + classNo);
            //배열을 위한 for 루프
                for (double data : gradeHeights[classNo - 1]) {
                    sum += data;
                }
            average = (sum / gradeHeights[classNo - 1].length);
        System.out.println("Height average : " + average);
        }

}
