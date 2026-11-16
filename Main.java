public class Main {
    public static void main(String[] args) {
        GestorSeguridad gestor = new GestorSeguridad();
        RolUsuario administrador = new RolAdministrador();
        RolUsuario editor = new RolEditor();
        RolUsuario invitado = new RolInvitado();
        System.out.println("rol administrativo");
        gestor.comprobarAcceso(administrador, "inicio");
        gestor.comprobarAcceso(administrador, "contenido");
        gestor.comprobarAcceso(administrador, "configuracion");
        System.out.println("\nrol editor");
        gestor.comprobarAcceso(editor, "contenido");
        gestor.comprobarAcceso(editor, "publicaciones");
        gestor.comprobarAcceso(editor, "configuracion");
        System.out.println("\nrol invitado");
        gestor.comprobarAcceso(invitado, "inicio");
        gestor.comprobarAcceso(invitado, "contenido");
        gestor.comprobarAcceso(invitado, "configuracion");
    }
}
