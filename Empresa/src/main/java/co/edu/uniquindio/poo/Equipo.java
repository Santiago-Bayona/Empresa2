package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

class Equipo {
    private String codigoEquipo;
    private List<Empleado> integrantes;

    // Constructor
    public Equipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
        this.integrantes = new ArrayList<>();
    }

    // Metodo para agregar un integrante al equipo
    public void agregarIntegrante(Empleado empleado) {
        integrantes.add(empleado);
    }

    // Metodo para eliminar un integrante del equipo
    public void eliminarIntegrante(Empleado empleado) {
        integrantes.remove(empleado);
    }

    // Getters y Setters
    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public List<Empleado> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Empleado> integrantes) {
        this.integrantes = integrantes;
    }


    /**
     * Metodo que pemite calcular el salario total del equipo
     * @return salrio total
     */
    public Double CalcularSalarioTotal() {
        Double salarioTotal = 0.0;
        for (Empleado empleado: integrantes){
            salarioTotal+=empleado.getSalario();
        }
        Logger.getInstance().log("Salario Total del equipo " + codigoEquipo + " es: "  + salarioTotal);
        return salarioTotal;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "codigoEquipo='" + codigoEquipo + '\'' +
                ", integrantes=" + integrantes +
                '}';
    }
}
