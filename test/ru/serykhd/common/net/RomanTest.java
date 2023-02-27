package ru.serykhd.common.net;

import org.openjdk.jmh.annotations.Benchmark;
import ru.serykhd.common.string.RomanUtil;

public class RomanTest {

    public static void main(String[] args) {
        RomanUtil.getRomanNumber(12451);
    }

    @Benchmark
    public static void main() {
        RomanUtil.getRomanNumber(12451);
    }
}
