package ru.serykhd.common.net.address.utils;

import lombok.NonNull;
import lombok.experimental.UtilityClass;
import ru.serykhd.common.net.address.exception.InvalidAddressException;
import ru.serykhd.common.net.address.org.apache.commons.validator.routines.InetAddressValidator;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class IPAddressUtils {

    public void checkValid(@NonNull String address) {
        checkValid(Arrays.asList(address));
    }

    public void checkValid(@NonNull List<String> addresses) {
        for (String address : addresses) {
            if (!InetAddressValidator.getInstance().isValid(address)) {
                throw new InvalidAddressException(address);
            }
        }
    }
}
