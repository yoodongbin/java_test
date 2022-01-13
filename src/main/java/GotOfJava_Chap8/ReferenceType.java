package GotOfJava_Chap8;

public class ReferenceType {
    public void callPassByValue() {
        int a=10;
        String b="b";
        MemberDTO member = new MemberDTO("sangmin");
        passByValue(a, b, member);
        System.out.println("callPassByValue method result !!!");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("member.name="+member.name);
    }

    private void passByValue(int a, String b, MemberDTO member) {
        a=20;
        b="z";
        member = new MemberDTO("sungChoon");
        member.name = "sungChoon";
        System.out.println("passByValue method result !!! ");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("member.name="+member.name);
    }
}
