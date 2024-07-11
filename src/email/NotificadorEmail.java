package email;

public class NotificadorEmail {
    private EmailCliente emailCliente;

    public NotificadorEmail(EmailCliente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void notificar(String direccion, String mensaje) {
        if (direccion == null || direccion.isEmpty()) {
            return; // No enviar correo si la dirección está vacía
        }
        emailCliente.enviarCorreo(direccion, mensaje);
    }
    // Método adicional para demostrar más funcionalidad si es necesario
    public void notificarAAdministradores(String mensaje) {
        emailCliente.enviarCorreo("administrador@example.com", mensaje);

    }
}

