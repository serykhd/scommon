package ru.serykhd.common.ratelimiter;

public interface IRateLimiter {

    boolean tryAcquire();
}
