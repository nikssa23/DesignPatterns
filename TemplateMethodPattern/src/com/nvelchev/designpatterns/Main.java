package com.nvelchev.designpatterns;

public class Main {

    public static void main(String[] args) {
        CrossCompiler iphoneCrossCompiler = new IPhoneCompiler();
        iphoneCrossCompiler.crossCompile();

        CrossCompiler androidCrossCompiler = new AndroidCompiler();
        androidCrossCompiler.crossCompile();
    }
}
