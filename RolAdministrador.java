public class RolAdministrador extends RolUsuario {
    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        return true;
    }
}
