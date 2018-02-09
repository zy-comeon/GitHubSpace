package com.fh.timetriger;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
	private Timer timer;

	/**
	 * 启动
	 * 
	 * @param time
	 */
	public void start(long time) {
		timer = new Timer();
		timer.schedule(new MyTimerTask(),0, time);
	}

	/**
	 * 停止
	 */
	public void stop() {
		timer.cancel();
	}

	/**
	 * 设置调度时间
	 * 
	 * @param time
	 */
	public void setTime(long time) {
		stop();
		start(time);
	}

	@Override
	public void run() {
		System.out.println("我又被执行了");

	}
	public static void main(String[] args) {
		MyTimerTask task=new MyTimerTask();
		task.start(3000);
	}
}
