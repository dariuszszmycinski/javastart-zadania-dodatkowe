class Main {
    public static void main(String[] args) {
        GameMachine.setGames();
        GameMachine.setCredit(GameMachineController.getCreditFromUser());
        GameMachine.buyGame(GameMachineController.getGameTitleFromUser());
    }
}
