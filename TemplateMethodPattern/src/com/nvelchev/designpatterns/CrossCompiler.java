package com.nvelchev.designpatterns;

public abstract class CrossCompiler {

    public final void crossCompile() {
        this.collectSources();
        this.compileToTarget();
    }

    public abstract void collectSources();

    public abstract void compileToTarget();
}
