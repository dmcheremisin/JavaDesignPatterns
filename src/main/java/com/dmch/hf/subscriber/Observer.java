package com.dmch.hf.subscriber;

public interface Observer {
    void update(int temp, int pressure, int humidity);
}
