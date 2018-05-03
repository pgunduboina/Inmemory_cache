package com.inmemorycache;
 
public interface Cache {
    
    void add(String key, Object value, long periodInMillis);
    
    Object get(String key);
 
    void remove(String key);
 
    void clear();
 
    long size();
}
