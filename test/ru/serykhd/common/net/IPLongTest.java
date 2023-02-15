package ru.serykhd.common.net;

import org.junit.Assert;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPLongTest {

    @Test
    public void testIPLong() throws UnknownHostException {
        Assert.assertEquals(IPLong.ip2long(InetAddress.getByName("147.135.231.100")), Long.valueOf("2475157348").longValue());
        Assert.assertEquals(IPLong.ip2long(InetAddress.getByName("255.255.255.255")), Long.valueOf("4294967295").longValue());

        Assert.assertEquals(IPLong.long2ip(Long.valueOf("2475157348").longValue()), InetAddress.getByName("147.135.231.100"));
        Assert.assertEquals(IPLong.long2ip(Long.valueOf("4294967295").longValue()), InetAddress.getByName("255.255.255.255"));
    }
}
