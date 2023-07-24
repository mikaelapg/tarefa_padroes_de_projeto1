public class Cliente {
    
    private String solicitar;
    private boolean temContrato;

    public Cliente(String solicitar, boolean temContrato) {
        this.solicitar = solicitar;
        this.temContrato = temContrato;
    }

    public boolean temContrato() {
        return temContrato;
    }

    public String getSolicitar() {
        return solicitar;
    }
}
