package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {
    private int powerConsumption;
    private int numberOfSpeakers;
    private int[] frequenceRange;
    private double cordLenght;

    public Speakers() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int[] getFrequenceRange() {
        return frequenceRange;
    }

    public void setFrequenceRange(int[] frequenceRange) {
        this.frequenceRange = frequenceRange;
    }

    public double getCordLenght() {
        return cordLenght;
    }

    public void setCordLenght(double cordLenght) {
        this.cordLenght = cordLenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption &&
                numberOfSpeakers == speakers.numberOfSpeakers &&
                Double.compare(speakers.cordLenght, cordLenght) == 0 &&
                Arrays.equals(frequenceRange, speakers.frequenceRange);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(powerConsumption, numberOfSpeakers, cordLenght);
        result = 31 * result + Arrays.hashCode(frequenceRange);
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequenceRange=" + Arrays.toString(frequenceRange) +
                ", cordLenght=" + cordLenght +
                '}';
    }
}
