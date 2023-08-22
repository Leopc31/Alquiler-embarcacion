import java.util.Scanner;

class Yate extends Embarcacion {
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public boolean esDeLujo() {
        return cantidadCamarotes > 7;
    }

    public void comprarYate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea comprar este yate? (S/N): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("¡Yate comprado con éxito!");
            // Aquí puedes agregar la lógica adicional para procesar la compra si es necesario.
        } else {
            System.out.println("El yate no ha sido comprado.");
        }
    }
}
