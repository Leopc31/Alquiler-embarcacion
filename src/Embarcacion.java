class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anoFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }

    // Getter y setter para capitan, precioBase, valorAdicional, anoFabricacion, y eslora

    public Capitan getCapitan() {
        return capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public double calcularMontoAlquiler() {
        double monto = precioBase;
        if (anoFabricacion > 2020) {
            monto += 20000;
        }
        return monto;
    }
}
