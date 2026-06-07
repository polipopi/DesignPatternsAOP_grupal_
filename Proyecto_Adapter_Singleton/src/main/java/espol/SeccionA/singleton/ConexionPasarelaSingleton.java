package espol.SeccionA.singleton;

public class ConexionPasarelaSingleton {
    private static ConexionPasarelaSingleton instancia;
    private final String nombreConexion;

    private ConexionPasarelaSingleton() {
        this.nombreConexion = "Conexion unica con la pasarela de pagos";
    }

    public static ConexionPasarelaSingleton getInstance() {
        if (instancia == null) {
            instancia = new ConexionPasarelaSingleton();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println(nombreConexion + " activa.");
    }
}
