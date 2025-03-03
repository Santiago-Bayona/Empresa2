package co.edu.uniquindio.poo;

public class Tecnico extends Empleado implements Contribuyente{

    public Categoria categoria;
    public enum Categoria{
        Redes,Software, Desarrollo
    }

    public Tecnico(String nombre,String id, double salario, int añosExperencia, Departamento departamento, Categoria categoria){
        super(nombre,id,salario,añosExperencia,departamento);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo que permite calcular el salrio del tecnico segun su especialidad
     * @return salario
     */
    @Override
    public double calcularSalario() {
        double salario = getSalario();
        switch (categoria){
            case Redes:
                salario = salario * 1.05;
                System.out.println("Salario Redes: " + salario);
                break;
            case Software:
                salario = salario * 1.10;
                System.out.println("Salario Software: " + salario);
                break;
            case Desarrollo:
                salario = salario * 1.15;
                System.out.println("Salario Desarrollo: " + salario);
                break;
            default:
                break;
        }
        Logger.getInstance().log("Salario del tecnico "+ nombre+ " es: " + salario);
        return salario;
    }

    /**
     * Metodo que permite ver de que manera contribuye el tecnico en la empresa
     */
    public void Contribuir(){
        System.out.println("Contribucion del Tecnico: " + nombre + " es ayudar con " + categoria);
    }

    @Override
    public String toString() {
        return "Tecnico{" + super.toString()+
                "categoria=" + categoria +
                '}';
    }
}
