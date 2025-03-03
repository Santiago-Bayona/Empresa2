package co.edu.uniquindio.poo;

public class Proyecto {

    public String nombre;
    public String codigoProyecto;
    public double presupuesto;
    public double costos;
    public Equipo equipo;

    public Proyecto(String nombre, String codigoProyecto, double presupuesto, double costos, Equipo equipo) {
        this.nombre = nombre;
        this.codigoProyecto = codigoProyecto;
        this.presupuesto = presupuesto;
        this.costos = costos;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getCostos() {
        return costos;
    }

    public void setCostos(double costos) {
        this.costos = costos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Metodo que permite calcular las ganacias de un proyecto
     * @return ganancias
     */
    public double calcularGanancias() {
        double salarioTotal = equipo.CalcularSalarioTotal();
        double ganancias = getPresupuesto() - (salarioTotal + getCostos());
        Logger.getInstance().log("Las ganancias fueron: " + ganancias);
        return ganancias;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigoProyecto + '\'' +
                ", presupuesto=" + presupuesto +
                ", costos=" + costos +
                ", equipo=" + equipo +
                '}';
    }
}