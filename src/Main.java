public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso del sistema
        Capitan capitan1 = new Capitan("Juan", "Perez", "12345");
        Velero velero1 = new Velero(capitan1, 10000, 0, 2022, 10.5, 5);
        System.out.println("El monto del alquiler del velero es: $" + velero1.calcularMontoAlquiler());
        System.out.println("¿El velero es grande? " + velero1.esGrande());

        Capitan capitan2 = new Capitan("Maria", "Gomez", "67890");
        Yate yate1 = new Yate(capitan2, 20000, 0, 2023, 15.0, 8);
        System.out.println("El monto del alquiler del yate es: $" + yate1.calcularMontoAlquiler());
        System.out.println("¿El yate es de lujo? " + yate1.esDeLujo());

        // Ejemplo de compra de un yate
        yate1.comprarYate();
    }
}
