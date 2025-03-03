package co.edu.uniquindio.poo;

public abstract class Empleado {

    public String nombre,Id;
    public double salario;
    public int AñosExperencia;
    public Departamento departamento;


    public Empleado(String nombre,String id, double salario, int añosExperencia, Departamento departamento) {
        this.nombre = nombre;
        this.Id = id;
        this.salario = salario;
        this.AñosExperencia = añosExperencia;
        this.departamento = departamento;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getAñosExperencia(){
        return AñosExperencia;
    }
    public void setAñosExperencia(int añosExperencia){
        this.AñosExperencia=añosExperencia;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Metodo para calclar salario
     * @return
     */
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", Id='" + Id + '\'' +
                ", salario=" + salario +
                ", AñosExperencia=" + AñosExperencia +
                '}';
    }
}
