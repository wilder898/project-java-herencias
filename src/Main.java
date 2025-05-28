import models.Chasis;
import models.Motor;
import models.Neumatico;
import models.SistemaFrenos;
import models.Transmision;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("M001", "Bosch", 4, 120);

        Transmision transmision = new Transmision("T001", "ZF", "Automática", 6);

        Neumatico neumatico = new Neumatico("N001", "Michelin", 17, 32.5);

        Chasis chasis = new Chasis("C001", "Toyota", "Monocasco", 250.0);

        SistemaFrenos frenos = new SistemaFrenos("F001", "Brembo", true, "Discos ventilados");

        System.out.println("==== MOTOR ====");
        motor.mostrarInformacion();
        motor.encenderMotor();

        System.out.println("\n==== TRANSMISIÓN ====");
        transmision.mostrarInformacion();
        transmision.cambiarMarcha(3);

        System.out.println("\n==== NEUMÁTICO ====");
        neumatico.mostrarInformacion();
        neumatico.verificarPresion();

        System.out.println("\n==== CHASIS ====");
        chasis.mostrarInformacion();
        chasis.calcularCargaMaxima();

        System.out.println("\n==== SISTEMA DE FRENOS ====");
        frenos.mostrarInformacion();
        frenos.verificarABS();
    }
}
