package ru.serykhd.common.net;

import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.net.InetAddress;
import java.net.Inet6Address;

@UtilityClass
public class IPLong {

    public long ip2long(@NonNull InetAddress ipAddress) {
        if (ipAddress instanceof Inet6Address) {
            throw new IllegalArgumentException();
        }

        long resultIP = 0;
        byte[] ipAddressOctets = ipAddress.getAddress();

        /*
        for (byte octet : ipAddressOctets) {
            resultIP <<= 8;
            resultIP |= octet & 0xFF;
        }*/


        //   resultIP <<= 8;
        resultIP |= ipAddressOctets[0] & 0xFF;

        resultIP <<= 8;
        resultIP |= ipAddressOctets[1] & 0xFF;

        resultIP <<= 8;
        resultIP |= ipAddressOctets[2] & 0xFF;

        resultIP <<= 8;
        resultIP |= ipAddressOctets[3] & 0xFF;

        return resultIP;
    }

    @SneakyThrows
    public static InetAddress long2ip(long i) {
        byte x0 = (byte) ((i >> 24 ) & 0xFF);
        byte x1 = (byte) ((i >> 16 ) & 0xFF);
        byte x2 = (byte) ((i >> 8 ) & 0xFF);
        byte x3 = (byte) (i        & 0xFF);
        return InetAddress.getByAddress(new byte[] {x0, x1, x2, x3});
    }
}

