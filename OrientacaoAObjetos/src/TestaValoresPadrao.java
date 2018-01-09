
public class TestaValoresPadrao {
	public static void main ( String [] args ) {
		Agencia a = new Agencia (1234) ;
		Conta c = new Conta ( a ) ;
		
		 System . out. println (" Valores Padrão ");
		 System . out. println (" Número : " + c. numero );
		 System . out. println (" Saldo : " + c. saldo );
		 System . out. println (" Limite : " + c. limite );
		 }
}
