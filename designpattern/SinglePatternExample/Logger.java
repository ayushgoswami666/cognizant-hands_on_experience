package SinglePatternExample;

public class Logger {
    private static Logger logger;

    private Logger() {
        // Private constructor to prevent instantiation
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
    
}
