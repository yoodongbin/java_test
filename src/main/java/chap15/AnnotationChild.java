package chap15;

public class AnnotationChild extends Parent{
    @Override
    public void printName() {
        super.printName();
        System.out.println("AnnotationChild");
    }

    @Deprecated
    public void noMoreUse() {

    }
}
