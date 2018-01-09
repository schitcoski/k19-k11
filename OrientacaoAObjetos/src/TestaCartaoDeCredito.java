
public class TestaCartaoDeCredito {
	public static void main(String[] args) {
		CartaoDeCredito cdc1 = new CartaoDeCredito(1111111);
		cdc1.dataDeValidade = "01/01/2023";

		CartaoDeCredito cdc2 = new CartaoDeCredito(222222);
		cdc2.dataDeValidade = "01/01/2024";

		System.out.println("Dados do primeiro cartão");
		System.out.println("Número: " + cdc1.numero);
		System.out.println("Data de validade: " + cdc1.dataDeValidade);

		System.out.println("-----------------------------------------");

		System.out.println("Dados do segundo cartão");
		System.out.println("Número: " + cdc2.numero);
		System.out.println("Data de validade: " + cdc2.dataDeValidade);
	}
}
