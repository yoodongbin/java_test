package InheritanceHW003;
/*
    임의로
    노트북을 배터리 양에 따라서
    배터리가 100일 경우 노트북 배터리가 충분하여 충전을 완료했습니다 라고 알림
    배터리가 100보다 작을 경우 절전모드
    20보다 작을 경우 충전 !

    원래는 lggram과 macbook의 특성에 맞게도 메소드를 더 추가하고 싶었으나 우선 이렇게 해보겠습니다.
 */
public class NoteBook {

    //메모리랑
    int memory;
    //ssd
    int ssd;
    //배터리양
    int battery;

    //배터리
    public int getBattery() {
        return battery;
    }

    //충전함
    public void chargeOn() {
        System.out.println("노트북이 충전중입니다. ");
    }
    //충전 안 함
    public void chargeOff() {
        System.out.println("노트북이 충전이 완료됐습니다. ");
    }

    //절전모드
    public void lowMode() {
        System.out.println("노트북이 절전모드입니다. ");
    }


}
