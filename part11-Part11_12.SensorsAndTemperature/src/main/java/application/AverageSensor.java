/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author timo
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
       List<Sensor> onSensors = sensors.stream().filter(s->s.isOn()).collect(Collectors.toList());
       return onSensors.size()==sensors.size();
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if(!this.isOn()){
            throw new IllegalStateException();
        }
        double avg = sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        this.readings.add((int)avg);
        return (int)avg;
    }
    
    public List<Integer> readings(){
        return readings;
    }
}
