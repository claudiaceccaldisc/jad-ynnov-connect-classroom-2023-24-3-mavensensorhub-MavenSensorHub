package com.jad.sensordata;

import com.jad.ISensor;
import com.jad.ISensorFactory;
import com.jad.SensorType;
import com.jad.sensordata.HumiditySensor;
import com.jad.sensordata.PressureSensor;
import com.jad.sensordata.TemperatureSensor;
import com.jad.sensordata.WindSpeedSensor;

public class SensorFactory implements ISensorFactory {
    @Override
    public ISensor make(SensorType sensorType) {
        return switch (sensorType) {
            case TEMPERATURE -> new TemperatureSensor();
            case HUMIDITY -> new HumiditySensor();
            case PRESSURE -> new PressureSensor();
            case WIND_SPEED -> new WindSpeedSensor();
        };
    }
}
