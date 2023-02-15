package ru.serykhd.common.ratelimiter.impl;

import ru.serykhd.common.ratelimiter.IRateLimiter;

public class EmptyRateLimiter implements IRateLimiter {

    public static final EmptyRateLimiter INSTANCE = new EmptyRateLimiter();

    @Override
    public boolean tryAcquire() {
        return false;
    }
}
