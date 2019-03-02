package pl.sda._JAVA_gda24_intro.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.METHOD,
    ElementType.TYPE
})
public @interface Info {
    String author();
    String date();
    String desc();
}
