package ru.serykhd.common.string;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class Joins {

    public String join(@NonNull List<String> lines) {
        return String.join("\n", lines);
    }
}
