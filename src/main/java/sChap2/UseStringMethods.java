package sChap2;

public class UseStringMethods {
    public static void main(String[] args){
        String api = "The String class represents character strings";
        String find = "string";
        UseStringMethods use = new UseStringMethods();
        use.printWords(api);
        use.findString(api, find);
        use.findAnyCaseString(api, find);
    }
    public void printWords(String str) {
        String[] text = str.split(" ");
        for(String temp : text) {
            System.out.println(temp);
        }
    }
    public void findString(String str, String findStr) {
        System.out.println("String is appeared at "+str.indexOf(findStr));
    }
    public void findAnyCaseString(String str, String findStr) {
        String lowerStr = str.toLowerCase();
        System.out.println(lowerStr.indexOf(findStr));
    }
}
