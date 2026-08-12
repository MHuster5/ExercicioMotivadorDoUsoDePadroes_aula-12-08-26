public class SUVFlex extends Carro{

    int consumoMotorAlcool;

    public SUVFlex(String modelo, TipoCombustivel tipoCombustivel, int consumoMotorGasolina, int consumoMotorAlcool, int capacidadeTanque) {
        super(modelo, tipoCombustivel, consumoMotorGasolina, capacidadeTanque);
        this.consumoMotorAlcool = consumoMotorAlcool;
    }

     public int verificaSePodeViajar(int distancia) {
        int combustivelNecessario = super.getMotor().combustivelNecessario(distancia);
        if (super.getTanque().getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return super.getTanque().getCombustivelDisponivel() * super.getMotor().getConsumo();
        }
    }



}
