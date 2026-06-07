package espol.SeccionA.adapter;

public class PayPalExternalService {
    public void enviarPagoPayPal(double cantidad) {
        System.out.println("Pago enviado al servicio externo PayPal por: $" + cantidad);
    }
}
