package com.nvelchev.designpatterns;

public class AndroidCompiler extends CrossCompiler {
    @Override
    public void collectSources() {
        System.out.println("collect android sources");
    }

    @Override
    public void compileToTarget() {
        System.out.println("compile android sources to target");
    }
}
