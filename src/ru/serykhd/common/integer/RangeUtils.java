package ru.serykhd.common.integer;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RangeUtils {

    /**
     * Убедитесь, что указанное примитивное значение находится между двумя
     * @param start
     * @param end
     * @param value
     * @return
     */
    public boolean inclusiveBetween(long start, long end, long value) {
        return value > start && value < end;
    }

    /**
     * Убедитесь, что указанное примитивное значение находится между двумя *или равному
     * @param start
     * @param end
     * @param value
     * @return
     */
    public boolean exclusiveBetween(long start, long end, long value) {
        return value >= start && value <= end;
    }
}