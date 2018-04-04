import logger.LogFactory;
import logger.Logger;
import logger.factories.BaseLogFactory;

public class Main {

    public static void main(String args[]){

        BaseLogFactory baseLogFactory = new BaseLogFactory();

        Logger logger = baseLogFactory.getLogger();

        logger.debug("debug");
        logger.error("error");
        logger.info("info");
        logger.trace("trace");



    }
}
