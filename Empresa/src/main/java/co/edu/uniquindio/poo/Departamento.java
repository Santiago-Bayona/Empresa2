package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;


public class Departamento {

        private String nombre;
        private String codigoDepartamento;
        private List<Empleado> listaEmpleados;

        // Constructor
        public Departamento(String nombre, String codigoDepartamento) {
            this.nombre = nombre;
            this.codigoDepartamento = codigoDepartamento;
            this.listaEmpleados = new ArrayList<>();
        }

        // Metodo para agregar un empleado al departamento
        public void agregarEmpleado(Empleado empleado) {
            listaEmpleados.add(empleado);
        }

        // Metodo para eliminar un empleado del departamento
        public void eliminarEmpleado(Empleado empleado) {
            listaEmpleados.remove(empleado);
        }

        // Metodo para obtener la cantidad de empleados en el departamento
        public int obtenerCantidadEmpleados() {
            int tamanio = 0;
            tamanio = listaEmpleados.size();
            Logger.getInstance().log("Cantidad de empleados: " + tamanio);
            return tamanio;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCodigoDepartamento() {
            return codigoDepartamento;
        }

        public void setCodigoDepartamento(String codigoDepartamento) {
            this.codigoDepartamento = codigoDepartamento;
        }

        public List<Empleado> getListaEmpleados() {
            return listaEmpleados;
        }

        public void setListaEmpleados(List<Empleado> listaEmpleados) {
            this.listaEmpleados = listaEmpleados;
        }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigoDepartamento + '\'' +
                ", listaEmpleados=" + listaEmpleados +
                '}';
    }
}
