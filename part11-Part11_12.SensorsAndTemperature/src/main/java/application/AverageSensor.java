package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
    @Override
    public boolean isOn() {
        boolean status = true;
        for (Sensor sensor : this.sensors) {
            if (!(sensor.isOn())) {
                status = false;
            }
        }
        return status;
    }
    
    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }
    
    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }
    
    @Override
    public int read() {
        if (this.isOn() && !(this.sensors.isEmpty())) {
            int reading = (int) this.sensors.stream()
                    .mapToInt(sensor -> sensor.read())
                    .average()
                    .getAsDouble();
            this.readings.add(reading);
            return reading;
        } else {
            throw new IllegalStateException();
        }
    }
}