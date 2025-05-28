import models.Motor;
import models.Transmision;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("M001", "Bosch", 4, 120);

        Transmision transmision = new Transmision("T001", "ZF", "Automática", 6);

        System.out.println("==== MOTOR ====");
        motor.mostrarInformacion();
        motor.encenderMotor();

        System.out.println("\n==== TRANSMISIÓN ====");
        transmision.mostrarInformacion();
        transmision.cambiarMarcha(3);
    }
}
