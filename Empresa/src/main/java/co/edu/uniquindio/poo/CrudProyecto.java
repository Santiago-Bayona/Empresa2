package co.edu.uniquindio.poo;

public interface CrudProyecto {

    public void agregarProyecto (Proyecto proyecto);
    public void eliminarProyecto (String codigoProyecto);
    public boolean verificarProyecto (String codigoProyecto);
    public boolean actualizarProyecto (String codigoProyecto, Proyecto actualizado);
}
