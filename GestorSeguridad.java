public class GestorSeguridad {
    public void comprobarAcceso(RolUsuario rol, String moduloSistema) {
        if (rol.verificarPermisoAcceso(moduloSistema)) {
            System.out.println("acceso permitido a: " + moduloSistema);
        } else {
            System.out.println("aceso denegado a: " + moduloSistema);
        }
    }
}
