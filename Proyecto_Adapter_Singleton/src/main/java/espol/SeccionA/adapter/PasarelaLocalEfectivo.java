package espol.SeccionA.adapter;

public class PasarelaLocalEfectivo implements ProcesadorDePago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago local en efectivo procesado por: $" + monto);
    }
}
