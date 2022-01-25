package ysjhaha.line.pmsannotation;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(PMSConfiguration.class)
public @interface PMSAnnotation {
}
