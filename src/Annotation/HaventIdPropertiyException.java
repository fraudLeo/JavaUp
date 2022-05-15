package Annotation;
/*
自定义异常
 */
public class HaventIdPropertiyException extends RuntimeException{
    public HaventIdPropertiyException() {
    }

    public HaventIdPropertiyException(String s) {
        super(s);
    }
}
