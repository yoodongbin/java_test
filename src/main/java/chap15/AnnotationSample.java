package chap15;

public class AnnotationSample {
//        @SuppressWarnings("deprecation")
        public void useDeprecated() {
            AnnotationChild child = new AnnotationChild();
            child.noMoreUse();
    }
}
