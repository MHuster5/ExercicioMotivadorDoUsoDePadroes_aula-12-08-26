public class SUVFlex extends Carro{

    int consumoMotorAlcool;
    Motor motorAlcool;
    Motor motorAtual;


    public SUVFlex(String modelo, TipoCombustivel tipoCombustivel, int consumoMotorGasolina, int consumoMotorAlcool, int capacidadeTanque) {
        super(modelo, tipoCombustivel, consumoMotorGasolina, capacidadeTanque);
        this.consumoMotorAlcool = consumoMotorAlcool;
        motorAlcool = new Motor(tipoCombustivel, consumoMotorAlcool);
    }

     public int verificaSePodeViajar(int distancia) {
        
        int combustivelNecessario = super.getMotor().combustivelNecessario(distancia);
        this.motorAtual = super.getMotor();

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

    public String toString(){
        return "Carro:\n  Modelo=" + super.getModelo() + "\n  Motor=" + motorAtual + "\n  Tanque=" + super.getTanque();
    }



}
