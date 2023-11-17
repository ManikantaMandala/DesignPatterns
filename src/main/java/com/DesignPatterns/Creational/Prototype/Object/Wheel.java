package com.DesignPatterns.Creational.Prototype.Object;

public class Wheel implements Prototype{
    private int radius;
    private WheelType wheelType;
    private String tyreName;

    private Wheel(int radius, WheelType wheelType, String tyreName) {
        this.radius = radius;
        this.wheelType = wheelType;
        this.tyreName = tyreName;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", wheelType=" + wheelType +
                ", tyreName='" + tyreName + '\'' +
                '}';
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }

    public int getRadius() {
        return radius;
    }

    public WheelType getWheelType() {
        return wheelType;
    }

    public String getTyreName() {
        return tyreName;
    }

    public static WheelBuilder builder(){
        return new WheelBuilder();
    }

    public static class WheelBuilder{
        private int radius;
        private WheelType wheelType;
        private String tyreName;

        public WheelBuilder radius(int radius) {
            this.radius = radius;
            return this;
        }

        public WheelBuilder wheelType(WheelType wheelType) {
            this.wheelType = wheelType;
            return this;
        }

        public WheelBuilder tyreName(String tyreName) {
            this.tyreName = tyreName;
            return this;
        }
        public boolean validate(){
            return true;
        }
        public Wheel build(){
            validate();
            return new Wheel(radius,  wheelType, tyreName);
        }
    }

    @Override
    public Wheel clone() {
        return Wheel.builder()
                .radius(this.radius)
                .wheelType(this.wheelType)
                .tyreName(this.tyreName)
                .build();
    }
}
