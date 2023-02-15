package ru.serykhd.common.net.address.exception;

import lombok.NonNull;

public class InvalidAddressException extends RuntimeException {

    public InvalidAddressException(@NonNull String address) {
        super(String.format("Address %s is invalid", address));
    }
}
