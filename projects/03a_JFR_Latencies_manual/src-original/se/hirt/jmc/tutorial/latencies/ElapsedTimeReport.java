package se.hirt.jmc.tutorial.latencies;

import javax.management.MBeanInfo;

public class ElapsedTimeReport implements ElapsedTimeReportMBean {
	private long timer;
	private long result = 0;

	public void startTimer() {
		timer = System.currentTimeMillis(); 
	}
	public void report(){
		result = System.currentTimeMillis() - timer;
	}
	public long getElapsedTime() {
		return result;
	}
	public synchronized MBeanInfo getMBeanInfo() {
		return null;
	}
}
