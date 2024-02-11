package info.loenwind.processor;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(SOURCE)
@Target({ TYPE, METHOD })
public @interface LangBuilder {

    String lang() default "en_us";

    String classname();

    Class<?> mod();

    String lang_field() default "lang";
}
