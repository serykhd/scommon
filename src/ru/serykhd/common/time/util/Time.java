package ru.serykhd.common.time.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Time {

    public long currentTimeSeconds() {
        return System.currentTimeMillis() / 1000L;
    }
}
