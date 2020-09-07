import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) {
        try{
            Drawable object = UserScanner.getShapeFromUser();
            if (object != null) {
                object.draw();
            }
        }catch (InputMismatchException e){
            System.err.println("Błędne dane!");
        }
    }
}
