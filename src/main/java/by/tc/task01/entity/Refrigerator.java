package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends Appliance implements Serializable {
	private int powerConsumption;
	private int weight;
	private int freezerCapasity;
	private int overalCapasity;
	private int height;
	private int width;

    public Refrigerator() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapasity() {
        return freezerCapasity;
    }

    public void setFreezerCapasity(int freezerCapasity) {
        this.freezerCapasity = freezerCapasity;
    }

    public int getOveralCapasity() {
        return overalCapasity;
    }

    public void setOveralCapasity(int overalCapasity) {
        this.overalCapasity = overalCapasity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption &&
                weight == that.weight &&
                freezerCapasity == that.freezerCapasity &&
                overalCapasity == that.overalCapasity &&
                height == that.height &&
                width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapasity, overalCapasity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapasity=" + freezerCapasity +
                ", overalCapasity=" + overalCapasity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
