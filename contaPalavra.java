package ExerciciosComMetodos;

import javax.swing.JOptionPane;

public class contaPalavra {

	public static String[] palavras(String frase) {

		String[] palavras = new String[20];

		int contagem = 0;

		frase = frase.toUpperCase();

		palavras = frase.split(" ");

		for (int i = 0; i < palavras.length; i++) {

			contagem++;
		}

		if (contagem > 0) {

			JOptionPane.showMessageDialog(null, "Quantidade de palavras da frase fornecida = " + contagem);
		}

		return palavras;
	}

}
