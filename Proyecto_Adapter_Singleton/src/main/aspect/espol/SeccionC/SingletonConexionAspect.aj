package espol.SeccionC;

public aspect SingletonConexionAspect {
    before(): call(* espol.SeccionA.singleton.ConexionPasarelaSingleton.getInstance()) {
        System.out.println("[AOP Singleton] Solicitud de acceso a la conexion unica.");
    }
}
