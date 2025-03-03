package co.edu.uniquindio.poo;

public class Logger {
    private static Logger instance;

    // Constructor privado para evitar instanciación directa
    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Metodo que permite anunciar
     * @param mensaje
     */
    public void log (String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}
