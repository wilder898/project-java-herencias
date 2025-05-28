import models.Motor;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("M001", "Bosch", 4, 120);

        System.out.println("==== MOTOR ====");
        motor.mostrarInformacion();
        motor.encenderMotor();
    }
}
