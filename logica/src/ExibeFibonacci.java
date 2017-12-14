
public class ExibeFibonacci {
	public static void main(String[] args) {
		int fibonacci = 1, anterior = 0;
		System.out.println(anterior);
		System.out.println(fibonacci);
		for(int contador = 3; contador <= 30; contador++) {
			int temp = fibonacci;
			fibonacci += anterior;
			anterior = temp;
			System.out.println(fibonacci);
		}

	}
}
