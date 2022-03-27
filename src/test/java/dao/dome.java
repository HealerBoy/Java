package dao;
import org.apache.log4j.Logger;

public class dome {
    public static final Logger logger=Logger.getLogger(JunitTest.class);
    public static void main(String[] args){
        logger.info("this is info");
        logger.debug("this is debug");
        logger.error("this is error");
        System.out.print("Hello World!！");
    }
}
