public class RolInvitado extends RolUsuario {
    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        if (moduloSistema.equals("inicio")) {
            return true;
        }
        return false;
    }
}
