package com.github.dhoard;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class JMXExporterLoggerTimeFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        String message = logRecord.getMessage();
        return (message.indexOf("TIME") >= 0 && message.indexOf(" ns ") >= 0);
    }
}
