package InheritanceHW003;

public class HWMain003 {

    public static void main(String[] args) {

        System.out.println("노트북");
        NoteBook noteBook = new NoteBook();
        noteBook.battery = 100;
        batteryCharge(noteBook.battery);

        System.out.println("\n엘지그램");
        LgGram lgGram = new LgGram();
        lgGram.battery = 20;
        batteryCharge(lgGram.battery);

        System.out.println("\n맥북");
        MacBook macBook = new MacBook();
        macBook.battery = 70;
        batteryCharge(macBook.battery);

    }
    public static void batteryCharge(int battery) {
        NoteBook noteBook = new NoteBook();
        if (battery > 20 && battery < 100) {
            System.out.println("절전 모드 " + battery);
            noteBook.lowMode();
        } else if (battery <= 20) {
            System.out.println("충전해야합니다. " + battery);
            noteBook.chargeOn();
        } else {
            System.out.println("배터리가 충분합니다. 충전을 멈추겠습니다." + battery);
            noteBook.chargeOff();
        }
    }
}
