class Room {
    private int volume;
    private AirConditioner airConditioner;
    private boolean isAirConditionerOn;
    private double targetTemperature;
    private double currentTemperature;

    public Room(int volume, AirConditioner airConditioner, boolean isAirConditionerOn, double targetTemperature, double currentTemperature) {
        this.volume = volume;
        this.airConditioner = airConditioner;
        this.isAirConditionerOn = isAirConditionerOn;
        this.targetTemperature = targetTemperature;
        this.currentTemperature = currentTemperature;
    }

    public int getVolume() {
        return volume;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public boolean isAirConditionerOn() {
        return isAirConditionerOn;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}
