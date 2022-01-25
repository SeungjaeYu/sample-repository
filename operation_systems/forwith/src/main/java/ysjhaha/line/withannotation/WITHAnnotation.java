package ysjhaha.line.withannotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(WITHConfiguration.class)
public @interface WITHAnnotation {
}
