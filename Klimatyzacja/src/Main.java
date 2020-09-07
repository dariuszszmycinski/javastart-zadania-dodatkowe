class Main {

    public static void main(String[] args) throws InterruptedException {
        double outsideTemperature = 28;
        Room livingRoom = new Room(25, AirConditioner.PRO, true, 23, outsideTemperature);
        Room kitchen = new Room(10, AirConditioner.BASIC, false, 0, outsideTemperature);
        Room bedroom = new Room(10, AirConditioner.BASIC, true, 19, outsideTemperature);
        Room corridor = new Room(5, AirConditioner.BASIC, true, 25, outsideTemperature);

        continueWork(livingRoom,kitchen,bedroom,corridor);

    }

    private static void changeTemperature(Room room) {
        if (room.isAirConditionerOn() && (room.getTargetTemperature() < room.getCurrentTemperature())) {
            room.setCurrentTemperature(room.getCurrentTemperature()-(double)room.getAirConditioner().efficiency/room.getVolume());
        }
    }

    private static void continueWork(Room... rooms) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            for (Room r:rooms) {
                changeTemperature(r);
                System.out.printf("%.2f ",r.getCurrentTemperature());
            }
            System.out.println();
            Thread.sleep(500);
        }
    }

}
