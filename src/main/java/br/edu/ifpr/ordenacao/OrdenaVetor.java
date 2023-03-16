package br.edu.ifpr.ordenacao;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenaVetor {

	public static void recebeDados(int tamanho, int[] digitados) {

		try {
			if (tamanho >= 0 && tamanho < 65530) {
				ArrayList<Integer> valores = new ArrayList<Integer>();

				for (int i = 0; i < tamanho; i++) {
					valores.add(digitados[i]);
				}
				imprime(valores);

				Collections.sort(valores);

				imprime(valores);
			} else {
				System.out.println("Tamanho inválido do vetor");
			}
		} catch (Exception e) {
			System.out.println("Tamanho inválido do vetor");
		}
	}

	private static void imprime(ArrayList<Integer> valores) {
		boolean primeiro = true;
		for (Integer n : valores) {
			if (primeiro) {
				System.out.print(n);
				primeiro = false;
			} else {
				System.out.print(", " + n);
			}
		}
		System.out.println();
	}
}
