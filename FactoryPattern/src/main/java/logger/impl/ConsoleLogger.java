package logger.impl;

import logger.Logger;

public class ConsoleLogger  implements Logger {
    @Override
    public void error(String message) {
        System.out.println("ConsoleLogger [error]: " + message);
    }

    @Override
    public void warning(String message) {
        System.out.println("ConsoleLogger [warning]: " + message);
    }

    @Override
    public void info(String message) {
        System.out.println("ConsoleLogger [info]: " + message);
    }

    @Override
    public void debug(String message) {
        System.out.println("ConsoleLogger [debug]: " + message);
    }

    @Override
    public void trace(String message) {
        System.out.println("ConsoleLogger [trace]: " + message);
    }
}
