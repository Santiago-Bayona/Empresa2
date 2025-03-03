package co.edu.uniquindio.poo;


import java.util.Collection;
import java.util.LinkedList;

public class Gerente extends  Empleado implements CrudProyecto,Contribuyente{
    public int EmpleadosAcargo;
    public Collection<Proyecto> proyectos;
    public Collection<Equipo>equipos;


    public Gerente(String nombre,String id, double salario, int añosExperencia, int EmpleadosAcargo,Departamento departamento) {
        super(nombre,id,salario,añosExperencia,departamento);
        this.EmpleadosAcargo = EmpleadosAcargo;
        this.proyectos = new LinkedList<>();
        this.equipos = new LinkedList<>();
    }



    public int getEmpleadosAcargo() {
        return EmpleadosAcargo;
    }
    public void setEmpleadosAcargo(int empleadosAcargo) {
        EmpleadosAcargo = empleadosAcargo;
    }
    public Collection<Proyecto> getProyectos() {
        return proyectos;
    }
    public void setProyectos(Collection<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    public Collection<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(Collection<Equipo> equipos) {
        this.equipos = equipos;
    }


    /**
     * Metodo que permite calcular el salrio del gerente segun los empleados a cargo que tiene
     * @return salario
     */
    @Override
    public double calcularSalario() {
        double resutado=0.0;
        if (EmpleadosAcargo > 5){
            resutado=salario*1.30;
        }
        else {
            resutado=salario;
        }
        System.out.println("El salario es: " + resutado);
        return resutado;
    }

    /**
     * Metodo que permite verificar la existencia de un proyecto
     *
     * @param codigoProyecto
     * @return true si el codigo no existe en la lista; false si ya existe un
     *         proyecto con ese codigo
     */

    public boolean verificarProyecto (String codigoProyecto) {
        for (Proyecto proyecto : proyectos) {
            if (codigoProyecto.equals(proyecto.getCodigoProyecto())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para agregar proyectos verificando que no estén duplicados
     *
     * @param proyecto
     */

    public void agregarProyecto (Proyecto proyecto) {
        boolean esUnico = verificarProyecto(proyecto.getCodigoProyecto());
        if (esUnico) {
            proyectos.add(proyecto);
            Logger.getInstance().log("Proyecto agregado exitosamente");
        } else {
            Logger.getInstance().log("Proyecto " + proyecto.getCodigoProyecto() + " ya existe");
        }
    }

    /**
     * Metodo para eliminar un proyecto
     * @param codigoProyecto
     */

    public void eliminarProyecto(String codigoProyecto) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getCodigoProyecto().equals(codigoProyecto)) {
                proyectos.remove(proyecto);
                Logger.getInstance().log("Proyecto eliminado exitosamente");
                break;
            }
        }
    }

    /**
     * Metodo que permite modificar un proyecto
     * @param codigoProyecto
     * @param actualizado
     * @return centinela
     */

    public boolean actualizarProyecto(String codigoProyecto, Proyecto actualizado) {
        boolean centinela = false;
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getCodigoProyecto().equals(codigoProyecto)) {
                proyecto.setCodigoProyecto(actualizado.getCodigoProyecto());
                proyecto.setNombre(actualizado.getNombre());
                proyecto.setPresupuesto(actualizado.getPresupuesto());
                proyecto.setCostos(actualizado.getCostos());
                centinela = true;
                break;
            }
        }
        return centinela;
    }


    /**
     * Metodo que muestra de que forma contribuye el gerente
     */
    public void Contribuir(){
        System.out.println("La contribucion del gerente " + nombre + " es por medio del manejo de distintos proyectos");
    }

    /**
     * Metodo para verificar equipo
     * @param codigoEquipo
     * @return booleano
     */
    public boolean VerificarEquipo (String codigoEquipo) {
        for (Equipo equipo : equipos) {
            if (codigoEquipo.equals(equipo.getCodigoEquipo())) {
                return false;
            }
        }
        return true;
    }


    /**
     * metodo que permite agregar un equipo
     * @param equipo
     */
    public void agergarEquipo (Equipo equipo) {
        boolean esUnico = VerificarEquipo(equipo.getCodigoEquipo());
        if (esUnico) {
            equipos.add(equipo);
            Logger.getInstance().log("Equipo agregado exitosamente");
        } else {
            Logger.getInstance().log("El equipo " + equipo.getCodigoEquipo() + " ya existe");
        }
    }


    /**
     * Metodo que permite eliminar un equipo
     * @param CodigoEquipo
     */
    public void eliminarEquipo(String CodigoEquipo) {
        for (Equipo equipo : equipos) {
            if (equipo.getCodigoEquipo().equals(CodigoEquipo)) {
                equipos.remove(equipo);
                Logger.getInstance().log("Equipo eliminado exitosamente");
                break;
            }
        }
    }


    @Override
    public String toString() {
        return "Gerente{" + super.toString()+
                ", EmpleadosAcargo=" + EmpleadosAcargo +
                '}';
    }
}
