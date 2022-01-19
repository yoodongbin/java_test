package chap15;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
/*
중복으로 사용하고자 할 때는
@Target({ElementType.METHOD, ElementType.TYPE})

 */
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnotation {
    public int number();
    public String text() default "This is first annotation";


}
