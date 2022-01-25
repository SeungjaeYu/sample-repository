package ysjhaha.line.cmsannotation;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(CMSConfiguration.class)
public @interface CMSAnnotation {
}
