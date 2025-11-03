package com.jad;

public interface ISensorFactory {
    ISensor make(SensorType sensorType);
}
