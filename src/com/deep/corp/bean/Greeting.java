package com.deep.corp.bean;

public class Greeting {
	
	private final long id;
    private final String content;
    private final Integer testId;

    public Greeting(long id, String content, Integer testId) {
        this.id = id;
        this.content = content;
        this.testId = testId;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public Integer getTestId() {
		return testId;
	}
    
    

}
