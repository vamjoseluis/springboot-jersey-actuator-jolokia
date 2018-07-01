package com.tuxpuckpepe.monitoring.impl;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import com.tuxpuckpepe.monitoring.api.EventCounterMBean;

@Component
@ManagedResource(objectName="com.tuxpuckpepe.monitoring.impl:type=EventCounterImpl")
public class EventCounterImpl implements EventCounterMBean{
	public static final String OBJECT_NAME="com.tuxpuckpepe.monitoring.impl:type=EventCounterImpl";
	private Integer count = 0;
	
	@Override
	@ManagedAttribute
	public Integer getEventCounter() {
		return this.count;
	}

	@Override
	@ManagedAttribute
	public void addEventCounter() {
		this.count++;
	}

	@Override
	@ManagedAttribute
	public void setEventCounter(Integer count) {
		this.count = count;
	}

}
