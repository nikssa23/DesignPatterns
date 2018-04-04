package logger.impl;

import logger.Logger;

public class FileLogger implements Logger {
    @Override
    public void error(String message) {
        System.out.println("FileLogger [error]: " + message);
    }

    @Override
    public void warning(String message) {
        System.out.println("FileLogger [warning]: " + message);
    }

    @Override
    public void info(String message) {
        System.out.println("FileLogger [info]: " + message);
    }

    @Override
    public void debug(String message) {
        System.out.println("FileLogger [debug]: " + message);
    }

    @Override
    public void trace(String message) {
        System.out.println("FileLogger [trace]: " + message);
    }
}
