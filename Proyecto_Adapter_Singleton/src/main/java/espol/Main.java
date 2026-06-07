package espol;

import espol.SeccionA.adapter.PasarelaLocalEfectivo;
import espol.SeccionA.adapter.PayPalAdapter;
import espol.SeccionA.adapter.PayPalExternalService;
import espol.SeccionA.adapter.ProcesadorDePago;
import espol.SeccionA.singleton.ConexionPasarelaSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Patron Adapter ===");
        ProcesadorDePago pagoLocal = new PasarelaLocalEfectivo();
        pagoLocal.procesarPago(25.50);

        ProcesadorDePago pagoPayPal = new PayPalAdapter(new PayPalExternalService());
        pagoPayPal.procesarPago(99.99);

        System.out.println("\n=== Patron Singleton ===");
        ConexionPasarelaSingleton conexion1 = ConexionPasarelaSingleton.getInstance();
        ConexionPasarelaSingleton conexion2 = ConexionPasarelaSingleton.getInstance();
        conexion1.conectar();
        System.out.println("Misma instancia: " + (conexion1 == conexion2));
    }
}
