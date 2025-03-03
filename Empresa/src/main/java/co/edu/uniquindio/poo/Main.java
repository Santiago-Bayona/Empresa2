package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Sistemas S.A");

        Departamento departamento1= new Departamento("Administracion","A1");
        Departamento departamento2= new Departamento("Desarrollo","A2");

        Equipo equipo1 = new Equipo("EQ1");
        Equipo equipo2 = new Equipo("EQ2");

        Gerente gerente = new Gerente("jso","414",4000,2,4,departamento1);
        Gerente gerente2 = new Gerente("Rosa","1478",8000,4,7,departamento2);

        Tecnico tecnico = new Tecnico("nd","54455",4000,4,  departamento1 ,Tecnico.Categoria.Software);
        Tecnico tecnico1= new Tecnico("pablo","544555",1000,4,departamento2,Tecnico.Categoria.Redes);
        Tecnico tecnico2 = new Tecnico("Maria", "8555", 2000,2,  departamento1,Tecnico.Categoria.Software);

        Proyecto  proyecto = new Proyecto("Creacion Api","P1",7000,3500,equipo1);
        Proyecto proyecto2 = new Proyecto("Transformacion Digital","P2",9000,4000,equipo2);

        empresa.agregarProyecto(proyecto);
        empresa.agregarProyecto(proyecto2);
        empresa.agregarGerente(gerente);
        empresa.agregarGerente(gerente2);
        empresa.agregarTecnico(tecnico);
        empresa.agregarTecnico(tecnico1);
        empresa.agregarTecnico(tecnico2);
        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);

        equipo2.agregarIntegrante(tecnico1);
        equipo2.agregarIntegrante(tecnico2);
        System.out.println(equipo2);

        proyecto2.calcularGanancias();

        gerente.calcularSalario();
        tecnico.calcularSalario();
        tecnico1.Contribuir();
        gerente.Contribuir();

        empresa.obtenerGerenteConMasEmpleados();

        departamento1.agregarEmpleado(gerente);
        departamento1.agregarEmpleado(tecnico);

        gerente.agergarEquipo(equipo1);
        gerente.agergarEquipo(equipo1);
        gerente.agregarProyecto(proyecto);
        departamento1.obtenerCantidadEmpleados();


        System.out.println(gerente);
    }
}