package com.tuxpuckpepe.monitoring.api;

public interface EventCounterMBean {
	  public Integer getEventCounter();
	  public void addEventCounter();
	  public void setEventCounter(Integer count);
}
