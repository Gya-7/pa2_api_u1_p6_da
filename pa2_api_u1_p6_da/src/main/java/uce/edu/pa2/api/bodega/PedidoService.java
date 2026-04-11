package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    @Inject
    private NotificadorMail notificadorMail;

    public void registrar(Pedido pedido) {


        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        //NotificadorMail n1 = new NotificadorMail(); sin DI

        //Con DI por el contenedor
        notificadorMail.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");

    }

}
