package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa implements CrudProyecto {
    
    public String nombre;
    public Collection<Proyecto> proyectos;
    public Collection<Tecnico> tecnicos;
    public Collection<Gerente> gerentes;
    public Collection<Departamento> departamentos;
    protected Logger logger;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.proyectos = new LinkedList<>();
        this.tecnicos = new LinkedList<>();
        this.gerentes = new LinkedList<>();
        this.departamentos = new LinkedList<>();
        this.logger=Logger.getInstance();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(Collection<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public Collection<Gerente> getGerentes() {
        return gerentes;
    }

    public void setGerentes(Collection<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

    public Collection<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Collection<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Collection<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(Collection<Proyecto> proyectos) {
        this.proyectos = proyectos;
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
            Logger.getInstance().log("Proyecto agregado: " + proyecto.getNombre());
        } else {
            Logger.getInstance().log("Proyecto no agregado: " + proyecto.getNombre());
        }
    }

    /**
     * Metodo para eliminar un proyecto
     * @param codigoProyecto
     * @return centinela
     */

    /**
     * Metodo para eliminar proyecto
     * @param codigoProyecto
     */
    public void eliminarProyecto(String codigoProyecto) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getCodigoProyecto().equals(codigoProyecto)) {
                proyectos.remove(proyecto);
                Logger.getInstance().log("Proyecto eliminado: " + proyecto.getNombre());
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
     * Metodo que permite verificar la existencia de un Tecnico
     *
     * @param Id
     * @return true si el id no existe en la lista; false si ya existe un
     *         tecnico con ese id
     */

    public boolean verificarTecnico (String Id) {
        for (Tecnico tecnico : tecnicos) {
            if (Id.equals(tecnico.getId())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para agregar Tecnicos verificando que no estén duplicados
     *
     * @param tecnico
     */

    public void agregarTecnico (Tecnico tecnico) {
        boolean esUnico = verificarTecnico(tecnico.getId());
        if (esUnico) {
            tecnicos.add(tecnico);
            Logger.getInstance().log("Tecnico agregado: " + tecnico.getNombre());
        } else {
            Logger.getInstance().log("Tecnico no agregado: " + tecnico.getNombre());
        }
    }

    /**
     * Metodo para eliminar un tecnico
     * @param Id
     *
     */

    public void eliminarTecnico(String Id) {
        for (Tecnico tecnico : tecnicos) {
            if (tecnico.getId().equals(Id)) {
                tecnicos.remove(tecnico);
                Logger.getInstance().log("Tecnico eliminado: " + tecnico.getNombre());
                break;
            }
        }
    }

    /**
     * Metodo que permite verificar la existencia de un Gerente
     *
     * @param Id
     * @return true si el id no existe en la lista; false si ya existe un
     *         gerente con ese id
     */

    public boolean verificarGerente (String Id) {
        for (Gerente gerente : gerentes) {
            if (Id.equals(gerente.getId())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para agregar gerentes verificando que no estén duplicados
     *
     * @param gerente
     */

    public void agregarGerente (Gerente gerente) {
        boolean esUnico = verificarGerente(gerente.getId());
        if (esUnico) {
            gerentes.add(gerente);
            Logger.getInstance().log("Gerente agregado: " + gerente.getNombre());
        } else {
            Logger.getInstance().log("Gerente no agregado: " + gerente.getNombre());
        }
    }

    /**
     * Metodo para eliminar un gerente
     * @param Id
     */

    public void eliminarGerente(String Id) {
        for (Gerente gerente : gerentes) {
            if (gerente.getId().equals(Id)) {
                gerentes.remove(gerente);
                Logger.getInstance().log("Gerente eliminado: " + gerente.getNombre());
                break;
            }
        }
    }

    /**
     * Metodo que permite verificar la existencia de un departamento
     *
     * @param codigoDepartamento
     * @return true si el codigo no existe en la lista; false si ya existe un
     *         departamento con ese codigo
     */

    public boolean verificarDepartamento (String codigoDepartamento) {
        for (Departamento departamento : departamentos) {
            if (codigoDepartamento.equals(departamento.getCodigoDepartamento())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para agregar departamentos verificando que no estén duplicados
     *
     * @param departamento
     */

    public void agregarDepartamento (Departamento departamento) {
        boolean esUnico = verificarDepartamento(departamento.getCodigoDepartamento());
        if (esUnico) {
            departamentos.add(departamento);
            Logger.getInstance().log("Departamento agregado: " + departamento.getNombre());
        } else {
            Logger.getInstance().log("Departamento no agregado: " + departamento.getNombre());
        }
    }

    /**
     * Metodo para eliminar un departamento
     * @param codigoDepartamento
     */

    public void eliminarDepartamento(String codigoDepartamento) {

        for (Departamento departamento : departamentos) {
            if (departamento.getCodigoDepartamento().equals(codigoDepartamento)) {
                departamentos.remove(departamento);
                Logger.getInstance().log("Departamento eliminado: " + departamento.getNombre());
                break;
            }
        }
    }

    /**
     * Metodo que permite obtener el gernte con mas enpleados a cargo
     * @return gerente con mas empleados
     */
    public Gerente obtenerGerenteConMasEmpleados() {
        if (gerentes == null || gerentes.isEmpty()) {
            return null;
        }

        Gerente gerenteConMasEmpleados = null;
        int maxEmpleados = -1;

        for (Gerente gerente : gerentes) {
            if (gerente.getEmpleadosAcargo() > maxEmpleados) {
                maxEmpleados = gerente.getEmpleadosAcargo();
                gerenteConMasEmpleados = gerente;
            }
        }

        System.out.println("El gerente con mas empleados a cargo es: " +gerenteConMasEmpleados.getNombre()+ " Con " +gerenteConMasEmpleados.EmpleadosAcargo + " empleados a cargo");
        return gerenteConMasEmpleados;
    }



    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", proyectos=" + proyectos +
                ", tecnicos=" + tecnicos +
                ", gerentes=" + gerentes +
                ", departamentos=" + departamentos +
                '}';
    }

}
