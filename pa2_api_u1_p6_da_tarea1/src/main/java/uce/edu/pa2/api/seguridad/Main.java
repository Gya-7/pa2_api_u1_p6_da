package uce.edu.pa2.api.seguridad;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        @Inject
        private AutenticadorService autenticadorService;

        @Override
        public int run(String... args) {
            Credenciales credenciales = new Credenciales("Aguilar", "WEDONOTHAVEAPROBLEM");
            Credenciales credenciales2 = new Credenciales("Dayerlin", "WEHAVEAPROBLEM");

            this.autenticadorService.autenticar(credenciales);
            this.autenticadorService.autenticar(credenciales2);
            return 0;
        }
    }
}
