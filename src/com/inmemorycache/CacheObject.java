package com.inmemorycache;

public class CacheObject {
	
    private Object value;
    private long expiryTime;

    public CacheObject(Object value2, long expiryTime2) {
		this.value=value2;
		this.expiryTime=expiryTime2;
	}

	boolean isExpired() {
        return System.currentTimeMillis() > expiryTime;
    }

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
