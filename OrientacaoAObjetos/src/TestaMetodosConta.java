
public class TestaMetodosConta {
public static void main(String[] args) {
	Conta c = new Conta();
	
	System.out.println("Chamando o método deposita passando o valor  1000");
	c.deposita(1000);
	c.imprimeExtrato();
	
	System.out.println("-------------------------------------------");
	 
	System.out.println("Chaando o métdo saca passando o valor 100");
	 c.saca(100);
	 c.imprimeExtrato();
	 
	 System.out.println("-------------------------------------------");
	 
	 double saldoDisponivel = c.consultaSaldoDisponivel();
	 System.out.println("SALDO DISPONÍVEL: " + saldoDisponivel);
}
}
