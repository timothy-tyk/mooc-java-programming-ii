/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stat;

import java.util.List;

/**
 *
 * @author timo
 */
public class Statistics {
    private List<Integer> numbers;
    public void add(int number) {
        this.numbers.add(number);
    }
    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}

