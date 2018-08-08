package com.dmch.hf.subscriber.weather;

public interface Observer {
    void update(int temp, int pressure, int humidity);
}
