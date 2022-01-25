package ysjhaha.line.bwiannotation;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(BWIConfiguration.class)
public @interface BWIAnnotation {
}
