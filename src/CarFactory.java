public class CarFactory extends Factory {

    @Override
    Car recuperar(String solicitar) {
        switch (solicitar) {
            case "A":
            return new Volkswagen(100,"cheio","azul");
            case "B":
            return new Toyota(100,"cheio","vermelho");
            default:
            System.out.println("o carro solicitado infelizmente não estava disponível");
            return null;
        }
    }
}
