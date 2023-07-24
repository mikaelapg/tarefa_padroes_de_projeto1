public abstract class Car {

    private int cavalosDePotencia;
    private String combustivel;
    private String cor;

    public Car(int cavalosDePotencia, String combustivel, String cor) {
        this.cavalosDePotencia = cavalosDePotencia;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void ligarMotor() {
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + combustivel + " foi iniciado, está pronto para utilizar " + cavalosDePotencia);
    }

    public void limpar() {
        System.out.println("O carro está limpo e a cor dele é: " + cor.toLowerCase());
    }

    public void verificacaoMecanica() {
        System.out.println("O carro foi checado pelo mecânico e está tudo bem!");
    }

    public void combustivelDoCarro() {
        System.out.println("O carro está com o combustivel: " + combustivel.toLowerCase());
    }
}
