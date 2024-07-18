package com.github.test;

import com.ly.doc.builder.ProjectDocConfigBuilder;
import com.ly.doc.model.ApiDoc;
import com.ly.doc.model.ApiSchema;
import com.ly.doc.model.annotation.FrameworkAnnotations;
import com.ly.doc.template.IDocBuildTemplate;
import com.thoughtworks.qdox.model.JavaClass;

import java.util.Collection;

/**
 * QuarkusDocBuildTemplate.
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2024-07-02 13:43:50
 */
public class QuarkusDocBuildTemplate implements IDocBuildTemplate<ApiDoc> {

    /**
     * render api
     *
     * @param projectBuilder   ProjectDocConfigBuilder
     * @param candidateClasses candidate classes
     * @return api ApiSchema
     */
    @Override
    public ApiSchema<ApiDoc> renderApi(ProjectDocConfigBuilder projectBuilder, Collection<JavaClass> candidateClasses) {
        return null;
    }

    /**
     * support framework.
     *
     * @param framework framework
     * @return boolean
     */
    @Override
    public boolean supportsFramework(String framework) {
        System.out.println("com.github.linwumingshi.QuarkusDocBuildTemplate.supportsFramework");
        return "Quarkus".equalsIgnoreCase(framework);
    }

    /**
     * registered annotations.
     *
     * @return registered annotations
     */
    @Override
    public FrameworkAnnotations registeredAnnotations() {
        return null;
    }

    /**
     * is entry point.
     *
     * @param javaClass            javaClass
     * @param frameworkAnnotations frameworkAnnotations
     * @return is entry point
     */
    @Override
    public boolean isEntryPoint(JavaClass javaClass, FrameworkAnnotations frameworkAnnotations) {
        return false;
    }
}
