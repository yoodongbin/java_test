package InheritanceHW002;
/*

    알콜클래스를 상속받은 술끼리 섞어서 칵테일만들기
 */
public class Alcohol {
    //술타입
    String type;
    //알콜 도수
    double getABV;

    public Alcohol() {

    }

    public Alcohol(String type, double getABV) {
        this.type = type;
        this.getABV = getABV;
    }

    public void getGetABV() {
        System.out.println("현재 도수는 : "+getABV);
    }

    public void mixedAlcohol (double setABV1, double setABV2) {
        this.getABV = setABV1 + setABV2;
        System.out.println("섞은 술의 도수는 " +this.getABV);
    }
}
