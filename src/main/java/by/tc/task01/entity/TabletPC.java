package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class TabletPC extends Appliance implements Serializable {
    private int batteryCapasity;
    private double displayInch;
    private int memoryRom;
    private int flashMemoryCapasity;
    private String color;

    public TabletPC() {
    }

    public int getBatteryCapasity() {
        return batteryCapasity;
    }

    public void setBatteryCapasity(int batteryCapasity) {
        this.batteryCapasity = batteryCapasity;
    }

    public double getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(double displayInch) {
        this.displayInch = displayInch;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapasity() {
        return flashMemoryCapasity;
    }

    public void setFlashMemoryCapasity(int flashMemoryCapasity) {
        this.flashMemoryCapasity = flashMemoryCapasity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return batteryCapasity == tabletPC.batteryCapasity &&
                Double.compare(tabletPC.displayInch, displayInch) == 0 &&
                memoryRom == tabletPC.memoryRom &&
                flashMemoryCapasity == tabletPC.flashMemoryCapasity &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapasity, displayInch, memoryRom, flashMemoryCapasity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapasity=" + batteryCapasity +
                ", displayInch=" + displayInch +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapasity=" + flashMemoryCapasity +
                ", color='" + color + '\'' +
                '}';
    }
}
