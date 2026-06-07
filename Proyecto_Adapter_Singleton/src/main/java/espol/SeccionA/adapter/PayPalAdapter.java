package espol.SeccionA.adapter;

public class PayPalAdapter implements ProcesadorDePago {
    private final PayPalExternalService servicioPayPal;

    public PayPalAdapter(PayPalExternalService servicioPayPal) {
        this.servicioPayPal = servicioPayPal;
    }

    @Override
    public void procesarPago(double monto) {
        servicioPayPal.enviarPagoPayPal(monto);
    }
}
