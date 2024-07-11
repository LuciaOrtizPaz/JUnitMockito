package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import email.EmailCliente;
import email.NotificadorEmail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class NotificadorEmailTest {

    @Mock
    private EmailCliente emailClienteMock;

    @Test
    public void testNotificar() {
        // Arrange
        NotificadorEmail notificador = new NotificadorEmail(emailClienteMock);

        // Act
        notificador.notificar("daniel@gmail.com", "Hola Daniel");

        // Assert
        verify(emailClienteMock).enviarCorreo("daniel@gmail.com", "Hola Daniel");
    }

    @Test
    public void testNotificarConDireccionVacia() {
        // Arrange
        NotificadorEmail notificador = new NotificadorEmail(emailClienteMock);

        // Act
        notificador.notificar("", "Mensaje");

        // Assert
        verify(emailClienteMock, never()).enviarCorreo(anyString(), anyString());
    }

    @Test
    public void testNotificarConMensajeNulo() {
        // Arrange
        NotificadorEmail notificador = new NotificadorEmail(emailClienteMock);

        // Act
        notificador.notificar("daniel@gmail.com", null);


    }


    @Test
    public void testNotificarConMensajeVacio() {
        // Arrange
        NotificadorEmail notificador = new NotificadorEmail(emailClienteMock);

        // Act
        notificador.notificar("ejemplo@test.com", "");

        // Assert
        verify(emailClienteMock).enviarCorreo("ejemplo@test.com", "");
    }
}
