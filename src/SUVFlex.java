public class SUVFlex extends Carro{

    private Motor motorAlcool;
    private Motor motorAtual;


    public SUVFlex(String modelo, TipoCombustivel tipoCombustivel, int consumoMotorGasolina, int consumoMotorAlcool, int capacidadeTanque) {
        super(modelo, tipoCombustivel, consumoMotorGasolina, capacidadeTanque);
        this.motorAlcool = new Motor(TipoCombustivel.ALCOOL, consumoMotorAlcool);
        this.motorAtual = super.getMotor();
    }
    
    @Override
     public int verificaSePodeViajar(int distancia) {
        
        int combustivelNecessario = super.getMotor().combustivelNecessario(distancia);

        if(super.getTipoCombustivelAtual() == TipoCombustivel.ALCOOL){
            combustivelNecessario = motorAlcool.combustivelNecessario(distancia);
            motorAtual = motorAlcool;
        }

        if (super.getTanque().getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return super.getTanque().getCombustivelDisponivel() * motorAtual.getConsumo();
        }
    }
    
    @Override
    public boolean viaja(int distancia) {
        if (verificaSePodeViajar(distancia) >= distancia) {
            motorAtual.percorre(distancia);
            getTanque().gasta(motorAtual.combustivelNecessario(distancia));
            return true;
    }
        return false;
    }

    public String toString(){
        return "Carro:\n  Modelo=" + super.getModelo() + "\n  Motor=" + motorAtual + "\n  Tanque=" + super.getTanque();
    }



}
