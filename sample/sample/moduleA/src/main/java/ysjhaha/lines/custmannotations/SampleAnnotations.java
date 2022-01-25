package ysjhaha.lines.custmannotations;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(SampleConfiguration.class)
public @interface SampleAnnotations {

}
