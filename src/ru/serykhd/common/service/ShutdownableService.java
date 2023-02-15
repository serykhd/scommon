package ru.serykhd.common.service;

public interface ShutdownableService {

    default void init() {

    }

    default void initAndStart() {
        init();
        start();
    }

    default void start() {

    }

    default void shutdown() {

    }
}
