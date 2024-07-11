package email;

public class SmtpEmailCliente implements EmailCliente {

    @Override
    public void enviarCorreo(String direccion, String mensaje) {
        // Implementación simulada de envío de correo vía SMTP
        System.out.println("Enviando correo a " + direccion + ":");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo enviado exitosamente.");
    }
}
