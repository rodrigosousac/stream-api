package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List<Integer> primos = numeros.stream()
				.distinct()
				.filter(Desafio17::ePrimo)
				.collect(Collectors.toList());
		
		System.out.println("Números primos: " + primos);
	}
	
	public static boolean ePrimo(int numero) {
		if(numero < 2) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(numero); i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
