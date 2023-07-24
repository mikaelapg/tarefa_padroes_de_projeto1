public class ContratosFactory extends Factory{

    @Override
    Car recuperar(String solicitar) {
        if ("A".equals(solicitar)) {
            return new Volkswagen(100, "cheio", "azul");
        } else {
            return new Toyota(150, "cheio", "vermelho");
        }
    }
    
}
