package log4j;
import org.apache.logging.log4j.*;

public class Main {
    private static Logger log= (Logger) LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
	log.debug("i am debugging");
if(5>4)
    log.info("greater number");
    log.error("not present");
        log.fatal("present");
        

    }
}
