public class Main2 {
    public static void main(String[] args) {
        VeiculoFactory fabricaDeCarros = new CarroFactory();

        Veiculo meuCarro = fabricaDeCarros.criarVeiculo();
        meuCarro.acelerar();
        System.out.println("-------------------------");


        VeiculoFactory fabricaDeMotos = new MotoFactory();

        Veiculo minhaMoto = fabricaDeMotos.criarVeiculo();
        minhaMoto.acelerar();
    }
}
