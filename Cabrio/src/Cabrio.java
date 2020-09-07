class Cabrio {
    private String name;
    private String brand;
    private boolean isGoing;
    private boolean isRoofOpen;

    public Cabrio(String name, String brand, boolean isGoing, boolean isRoofOpen) {
        this.name = name;
        this.brand = brand;
        this.isGoing = isGoing;
        this.isRoofOpen = isRoofOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isGoing() {
        return isGoing;
    }

    public void setGoing(boolean going) {
        isGoing = going;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if (isGoing==false){
            isRoofOpen = roofOpen;
        }else{
            System.err.println("Nie można sterować dachem w trakcie ruchu!");
        }
    }
}
