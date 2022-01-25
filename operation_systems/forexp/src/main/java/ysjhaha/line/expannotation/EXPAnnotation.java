package ysjhaha.line.expannotation;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(EXPConfiguration.class)
public @interface EXPAnnotation {
}
