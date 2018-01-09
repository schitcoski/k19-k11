	class MediaArgumentos{
		public static void main(String[] args) {
			double somaDosArgumentos = 0;
			for (String arg : args) {
						somaDosArgumentos += Double.parseDouble(arg);
				}	
			System.out.println("Media dos argumentos: " + somaDosArgumentos/args.length);
		}

	}