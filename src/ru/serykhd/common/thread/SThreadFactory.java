package ru.serykhd.common.thread;

import lombok.NonNull;

import java.util.concurrent.ThreadFactory;

public class SThreadFactory implements ThreadFactory {

    private final String name;

    public SThreadFactory(@NonNull String name) {
        this.name = name;
    }

    public Thread newThread(Runnable r) {
        return new Thread(r, name);
    }
}
