package InheritanceHW005;

public class HWMain005 {

    public static void main(String[] args) {
        AppleSmart apple = new AppleSmart(2);
        wideAngle(apple);
        System.out.println();
        GalaxySmart galaxy = new GalaxySmart(6);
        wideAngle(galaxy);
    }
    public static void wideAngle(SmartPhone smartPhone) {

        if(smartPhone.getLens() > 2) {
            System.out.println("광각 카메라가 있습니다.");
        }else {
            System.out.println("일반 카메라 입니다.");
        }
    }
}
