public class App {
    public static void main(String[] args) throws Exception {

        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);

        System.out.println("Tipos de veiculos:");
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(250);
        esportivo.viaja(150);
        System.out.println(esportivo);
        System.out.println("\n\n-----------------------------------");
        
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DISEL, 5, 70);

        System.out.println("Tipos de veiculos:");
        System.out.println(utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro utilitario com gasolina");
        utilitario.abastece(TipoCombustivel.GASOLINA, 70);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(250);
        utilitario.viaja(150);
        System.out.println(utilitario);
        System.out.println("\n\n-----------------------------------");

        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(suv);

        System.out.println("\n\n-----------------------------------");
        System.out.println("\nAbastencendo carro SUV com gasolina");
        suv.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(suv);
        System.out.println("\nViajando com o carro SUV");
        suv.viaja(250);
        suv.viaja(150);
        System.out.println(suv);
    }
}
