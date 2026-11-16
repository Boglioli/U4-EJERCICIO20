public class RolEditor extends RolUsuario {
    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        if (moduloSistema.equals("contenido") || moduloSistema.equals("publicaciones")) {
            return true;
        }
        return false;
    }
}