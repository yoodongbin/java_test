package InheritanceHW005;

public class SmartPhone {

    int lens;

    public SmartPhone() {
    }

    public SmartPhone(int lens) {
        this.lens = lens;
        System.out.println("스마트폰에 카메라 렌즈 수 : "+lens);
    }

    public int getLens() {
        return lens;
    }
}
