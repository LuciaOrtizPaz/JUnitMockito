import email.EmailCliente;
import email.NotificadorEmail;
import email.SmtpEmailCliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // instancia de EmailCliente concreto (ej. SmtpEmailCliente)
        EmailCliente emailCliente = new SmtpEmailCliente();

        // Instanciar NotificadorEmail con la implementación concreta de EmailCliente
        NotificadorEmail notificador = new NotificadorEmail(emailCliente);

        // Ejemplo de uso: notificar a un usuario específico
        String direccionDestino = "luciaizabelortizpaz556@gmail.com";
        String mensaje = "Hola, Realizando prueba.";

        notificador.notificar(direccionDestino, mensaje);

        // Ejemplo adicional: notificar a administradores
        String mensajeAdmin = "Este es un mensaje para los admin.";
        notificador.notificarAAdministradores(mensajeAdmin);
    }
}