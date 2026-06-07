package espol.SeccionB;

public aspect AdapterPagoAspect {
    before(double monto): execution(* espol.SeccionA.adapter.ProcesadorDePago+.procesarPago(double)) && args(monto) {
        System.out.println("[AOP Adapter] Se va a procesar un pago por: $" + monto);
    }
}
