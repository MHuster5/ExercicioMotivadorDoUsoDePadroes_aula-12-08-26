public class Econo extends Carro {

    private static final int CONSUMO_INICIAL = 20;
    private static final int CONSUMO_MINIMO = 10;
    private static final int KM_POR_REDUCAO = 5000;

    public Econo(String modelo, int capacidadeTanque) {
        super(modelo, TipoCombustivel.GASOLINA, CONSUMO_INICIAL, capacidadeTanque);
    }

    private int getConsumoAtual() {
        int reducoes = getMotor().getQuilometragem() / KM_POR_REDUCAO;
        return Math.max(CONSUMO_INICIAL - reducoes, CONSUMO_MINIMO);
    }

    @Override
    public int verificaSePodeViajar(int distancia) {
        int combustivelNecessario = distancia / getConsumoAtual();
        if (getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return getCombustivelDisponivel() * getConsumoAtual();
        }
    }

    @Override
    public boolean viaja(int distancia) {
        if (verificaSePodeViajar(distancia) >= distancia) {
            int combustivelNecessario = distancia / getConsumoAtual();
            getMotor().percorre(distancia);
            getTanque().gasta(combustivelNecessario);
            return true;
        }
        return false;
    }
}
