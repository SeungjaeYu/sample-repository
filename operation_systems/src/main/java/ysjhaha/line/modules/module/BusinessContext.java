package ysjhaha.line.modules.module;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import ysjhaha.line.bwiannotation.BWIAnnotation;
import ysjhaha.line.cmsannotation.CMSAnnotation;
import ysjhaha.line.expannotation.EXPAnnotation;
import ysjhaha.line.operation_systems.StarterAnnotation;
import ysjhaha.line.pmsannotation.PMSAnnotation;
import ysjhaha.line.withannotation.WITHAnnotation;


@Configuration
@StarterAnnotation
@BWIAnnotation
@CMSAnnotation
@EXPAnnotation
@PMSAnnotation
@WITHAnnotation
@EnableAutoConfiguration
public class BusinessContext {
}
