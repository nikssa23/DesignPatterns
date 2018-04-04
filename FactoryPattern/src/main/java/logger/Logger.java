package logger;

public interface Logger {

    public void error(String message);

    public void warning(String message);

    public void info(String message);

    public void debug(String message);

    public void trace(String message);

}
