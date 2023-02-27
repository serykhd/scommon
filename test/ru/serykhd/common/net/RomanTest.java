package ru.serykhd.common.net;

import org.openjdk.jmh.annotations.Benchmark;
import ru.serykhd.common.string.RomanUtil;
import ru.serykhd.common.string.RomanUtil2;

public class RomanTest {

    public static void main(String[] args) {
        System.out.println(RomanUtil.getRomanNumber(12451));
        System.out.println(RomanUtil2.intToRoman(12451));
    }

    @Benchmark
    public static void main2() {
        // RomanUtil2.intToRoman(12451);    // 6 874 482.596 ops/s
        //  RomanUtil.getRomanNumber(12451);// 2 454 870.067 ops/s

        // RomanUtil2.intToRoman(250); // 37 796 465.596 ops/s
          RomanUtil.getRomanNumber(250);// 11 592 406 ops/s
    }
}
