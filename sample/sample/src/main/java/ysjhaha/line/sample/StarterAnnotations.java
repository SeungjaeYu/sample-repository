package ysjhaha.line.sample;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(StarterConfiguration.class)
public @interface StarterAnnotations {
}
