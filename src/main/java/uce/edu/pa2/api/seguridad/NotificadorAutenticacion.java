package uce.edu.pa2.api.seguridad;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorAutenticacion {


    public void autentificador(String usuario){

        System.out.println("Se ha intentando ingresar con el usuario: " + usuario);


    }



}
