package ru.serykhd.common;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.Objects;

@UtilityClass
public class Validator {

    public void isTrue(boolean expression) {
        if (expression) {
            return;
        }

        throw new IllegalArgumentException("The validated expression is false");
    }

    public void checkArgument(boolean expression) {
        isTrue(expression);
    }

    @Deprecated
    public void checkNotNull(@NonNull Object check) {
        Objects.requireNonNull(check);
    }
}
