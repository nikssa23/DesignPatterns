package logger.impl;

import logger.Logger;

public class DataBaseLogger implements Logger {
    @Override
    public void error(String message) {
        System.out.println("DataBaseLogger [error]: " + message);
    }

    @Override
    public void warning(String message) {
        System.out.println("DataBaseLogger [warning]: " + message);
    }

    @Override
    public void info(String message) {
        System.out.println("DataBaseLogger [info]: " + message);
    }

    @Override
    public void debug(String message) {
        System.out.println("DataBaseLogger [debug]: " + message);
    }

    @Override
    public void trace(String message) {
        System.out.println("DataBaseLogger [trace]: " + message);
    }
}
