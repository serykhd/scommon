package ru.serykhd.common.time.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TimeUtils {

    public double toMillis(long nanos) {
        return nanos / 1_000_000.0;
    }

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}