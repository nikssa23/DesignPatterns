package com.nvelchev.designpatterns;

public class IPhoneCompiler extends CrossCompiler {
    @Override
    public void collectSources() {
        System.out.println("collect iphone sources");
    }

    @Override
    public void compileToTarget() {
        System.out.println("compile iphone sources to target");
    }
}
