package mdcbot;

public interface ILoggable
{
    default void log(LogLevel level, String message, Object... args)
    {
        Util.log(getClass(), level, message, args);
    }

    default void info(String message, Object... args)
    {
        log(LogLevel.INFO, message, args);
    }

    default void debug(String message, Object... args)
    {
        log(LogLevel.DEBUG, message, args);
    }

    default void warn(String message, Object... args)
    {
        log(LogLevel.WARN, message, args);
    }

    default void error(String message, Object... args)
    {
        log(LogLevel.ERROR, message, args);
    }
}
