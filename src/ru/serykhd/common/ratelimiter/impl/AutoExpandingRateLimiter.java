package ru.serykhd.common.ratelimiter.impl;

import ru.serykhd.common.ratelimiter.IRateLimiter;

import java.time.Duration;

public class AutoExpandingRateLimiter implements IRateLimiter {

    private final long[] requests;
    private final long expireTime;
    private int position;

    public AutoExpandingRateLimiter(int maxLimit, Duration duration) {
        this(maxLimit, duration.toMillis());
    }

    public AutoExpandingRateLimiter(int maxLimit, long expireTime) {
        this.requests = new long[maxLimit];
        this.expireTime = expireTime;
    }

    public boolean tryAcquire() {
        // current time millis is not monotonic - it can jump back depending on user choice or NTP
        long now = System.nanoTime() / 1_000_000;

        // after this the request should be expired
        long toBeExpired = now - expireTime;
        synchronized (this) {
            // having synchronized will limit the amount of concurrency a lot
            long oldest = requests[position];

            //
            requests[position] = now;
            position = (position + 1) % requests.length;

            return oldest < toBeExpired;
        }
    }
}