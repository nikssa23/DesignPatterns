package logger.factories;

import logger.LogFactory;
import logger.Logger;
import logger.impl.ConsoleLogger;
import logger.impl.DataBaseLogger;
import logger.impl.FileLogger;
import logger.impl.TCPLogger;

public class BaseLogFactory  {

    public Logger getLogger() {

        /*
            C -> Console
            D -> DataBase
            F -> File
            T-> TCP
         */
        String loggerType = System.getProperty("logger.type", "C");

        switch (loggerType) {
            case "C":
                return new ConsoleLogger();
            case "D":
                return new DataBaseLogger();
            case "F":
                return new FileLogger();
            case "T":
                return new TCPLogger();
            default:
                return new ConsoleLogger();
        }
    }
}
