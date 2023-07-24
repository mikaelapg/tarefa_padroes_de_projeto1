
public abstract class Factory {

    public Car criar(String solicitar) { //requestGrade
        Car carro = recuperar(solicitar);
        carro = prepararCarro(carro);
        return carro;
    }

    private Car prepararCarro(Car carro) {
        carro.limpar();
        carro.verificacaoMecanica();
        carro.combustivelDoCarro();
        return carro;
    }

    abstract Car recuperar(String solicitar); //recuperar
}

