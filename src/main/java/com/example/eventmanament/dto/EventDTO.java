package com.example.eventmanament.dto;

public class EventDTO {
	private String name;
	private String timeStartEvent;
	private String timeEndEvent;
	
	public EventDTO(String name, String timeStartEvent, String timeEndEvent) {
		this.name = name;
		this.timeStartEvent = timeStartEvent;
		this.timeEndEvent = timeEndEvent;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimeStartEvent() {
		return timeStartEvent;
	}
	public void setTimeStartEvent(String timeStartEvent) {
		this.timeStartEvent = timeStartEvent;
	}
	public String getTimeEndEvent() {
		return timeEndEvent;
	}
	public void setTimeEndEvent(String timeEndEvent) {
		this.timeEndEvent = timeEndEvent;
	}
}
