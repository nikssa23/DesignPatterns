package logger.impl;

import logger.Logger;

public class TCPLogger implements Logger {
    @Override
    public void error(String message) {
        System.out.println("TCP Logger [error]: " + message);
    }

    @Override
    public void warning(String message) {
        System.out.println("TCP Logger [waring]: " + message);
    }

    @Override
    public void info(String message) {
        System.out.println("TCP Logger [info]: " + message);
    }

    @Override
    public void debug(String message) {
        System.out.println("TCP Logger [debug]: " + message);
    }

    @Override
    public void trace(String message) {
        System.out.println("TCP Logger [trace]: " + message);
    }
}
