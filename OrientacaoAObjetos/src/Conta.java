
public class Conta {
	public int numero ;
	public double saldo ;
	public double limite = 100;
	public Agencia agencia;

	Conta ( Agencia agencia ) {
		this.agencia = agencia ;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void imprimeExtrato() {
		System.out.println("SALDO: " + this.saldo);
	}

	public double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}

	void transfere ( Conta destino , double valor ) {
		this . saldo -= valor ;
		destino . saldo += valor ;
	}
}
