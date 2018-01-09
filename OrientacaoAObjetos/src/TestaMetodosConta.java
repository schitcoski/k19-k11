
public class TestaMetodosConta {
public static void main(String[] args) {
	Agencia a = new Agencia (1234) ;
	Conta c = new Conta ( a ) ;
	
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
