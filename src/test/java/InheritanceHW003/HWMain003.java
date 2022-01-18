package InheritanceHW003;

public class HWMain003 {

    public static void main(String[] args) {

        System.out.println("노트북");
        NoteBook noteBook = new NoteBook(100);
        batteryCharge(noteBook);

        System.out.println("\n엘지그램");
        LgGram lgGram = new LgGram(20);
        batteryCharge(lgGram);

        System.out.println("\n맥북");
        MacBook macBook = new MacBook(70);
        batteryCharge(macBook);

    }
    public static void batteryCharge(NoteBook noteBook) {
        if (noteBook.getBattery() > 20 && noteBook.getBattery() < 100) {
            System.out.println("절전 모드 " + noteBook.getBattery());
            noteBook.lowMode();
        } else if (noteBook.getBattery() <= 20) {
            System.out.println("충전해야합니다. " + noteBook.getBattery());
            noteBook.chargeOn();
        } else {
            System.out.println("배터리가 충분합니다. 충전을 멈추겠습니다." + noteBook.getBattery());
            noteBook.chargeOff();
        }
    }
}
