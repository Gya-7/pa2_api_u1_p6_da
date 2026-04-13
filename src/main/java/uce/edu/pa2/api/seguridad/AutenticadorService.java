package uce.edu.pa2.api.seguridad;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AutenticadorService {

    @Inject
    private NotificadorAutenticacion na;
    private String usuario = "Dayerlin";
    private String contrasenia = "WEHAVEAPROBLEM";

    public void autenticar(Credenciales credenciales){

        System.out.println("Bienvenido");

    if (usuario.equals(credenciales.getUsuario()) && contrasenia.equals(credenciales.getContrasenia())){

    
            na.autentificador(credenciales.getUsuario() + " -> Acceso Permitido");

            
        } else {
            na.autentificador(credenciales.getUsuario() + " -> Acceso denegado");
        }

    }


}
