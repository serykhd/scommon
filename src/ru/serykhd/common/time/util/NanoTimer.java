package ru.serykhd.common.time.util;

public class NanoTimer {

	private long start;
	
	public NanoTimer() {
		record();
	}

	private void record() {
		start = System.nanoTime();
	}

	public long getElapsedNano() {
		long curr = System.nanoTime();
		
		long res = curr - start;

		start = curr;

		return res;
	}

	public String getElapsed() {;
		return String.format("%sms", TimeUtils.toMillis(getElapsedNano()));
	}

	public void print() {
		System.out.printf("NanoTimer complete at %s", getElapsed());
	}
}
