package com.typewrite;

import java.util.Timer;

public class MyThread extends Thread {
	@Override
	public void run() {
		Timer timer = new Timer();
		timer.schedule(new TimeIsOut(), 3000);
		if (Thread.currentThread().isInterrupted()) {
			timer.cancel();
		}
	}
}
