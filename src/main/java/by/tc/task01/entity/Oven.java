package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {
    private int id;
	private int powerConsumption;
	private int weight;
	private int capasity;
	private int dept;
	private int height;
	private int width;
	public Oven(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
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
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption &&
                weight == oven.weight &&
                capasity == oven.capasity &&
                dept == oven.dept &&
                height == oven.height &&
                width == oven.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capasity, dept, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capasity=" + capasity +
                ", dept=" + dept +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
