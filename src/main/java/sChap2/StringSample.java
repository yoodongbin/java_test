package sChap2;

public class StringSample {
    public static void main(String[] args){
        StringSample sample = new StringSample();
        sample.constructor();
        System.out.println(sample.nullCheck(null));
        sample.compareCheck();
        sample.addressCheck();
        sample.matchCheck();
        sample.indexOfCheck();
        sample.substringCheck1();
        sample.splitCheck();
        sample.trimCheck();
    }



    public void constructor(){
        try{
            //예제 넣을 부분
            String str = "한글";
            byte[] array1 = str.getBytes();
            printByteArray(array1);
            String str1 = new String(array1);
            System.out.println(str1);

            byte[] array2 = str.getBytes();
            printByteArray(array2);
            String str2 = new String(array2,"EUC-KR");
            System.out.println(str2);

            byte[] array3 = str.getBytes();
            printByteArray(array3);
            String str3 = new String(array3,"UTF-16");
            System.out.println(str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array) {
        for(byte data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public boolean nullCheck(String text) {
//        int textLength = text.length();
//        System.out.println(textLength);
        if(text==null) return true;
        else return false;
    }

    public void compareCheck() {
        String text1 = "check_aBc";
        String text2 = "check_AbC";
        System.out.println(text1.length());
        System.out.println(text1.isEmpty());
        System.out.println(text1.equalsIgnoreCase(text2));
    }

    public void addressCheck() {
        String addresses[] = new String[] {
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동",
                "서울시 구로구 개봉동",
        };
        int startCount =0, endCount=0;
        String startText = "서울시";
        String endText = "동";
        for(String address : addresses) {
            if(address.startsWith(startText)) {
                startCount++;
            }
            if(address.endsWith(endText)) {
                endCount++;
            }
            if (address.contains(startText)) {
                System.out.println("서울시 포함");
            }
        }
        System.out.println(startText +", "+startCount);
        System.out.println(endText +", "+endCount);
        System.out.println();

    }

    public void matchCheck() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        //매개변수가 4개
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        //매개변수가 4개
        System.out.println(text.regionMatches(6, compare1, 0, 2));
        //매개변수가 5개개
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }

    public void indexOfCheck() {
        String text = "Java technology is both a programming language and ad platform.";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a',20));
        System.out.println(text.indexOf("a ",20));
        System.out.println(text.indexOf('z'));

    }

    public void substringCheck1() {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);
        System.out.println(technology.split(" "));
    }

    public void splitCheck() {
        String text = "Java technology is both a programming language and ad platform.";
        String[] splitArray = text.split(" ");
        for (String temp : splitArray) {
            System.out.println(temp);
        }
    }

    private void trimCheck() {
        String strings[] = new String[] {
                " a", "b ","   c","d   ","e   f","    "
        };
        for(String string : strings) {
            System.out.println("["+string+']');
            System.out.println("Trim["+string.trim()+"] ");
        }
    }
}
