class MaiorNumero{
	public static void main(String[] args) {
		double maior,atual;
		maior = Double.parseDouble(args[0]);
		for (String arg : args) {
			atual = Double.parseDouble(arg);
			if( atual > maior) maior = atual;
		}
		System.out.println("Maior numero:" + maior);
	}
}