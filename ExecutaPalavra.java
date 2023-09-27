package ExerciciosComMetodos;

import javax.swing.JOptionPane;

public class ExecutaPalavra {

	public static void main(String[] args) {

		/*
		 * Exercício 2: Contagem de Palavras Crie um método que aceite uma frase como
		 * parâmetro e retorne o número de palavras na frase. O método deve considerar
		 * palavras separadas por espaços em branco.
		 */

		String frase;

		do {

			try {

				frase = JOptionPane.showInputDialog(null, "Forneça uma frase");

				frase = frase.toLowerCase();

				if (frase == null || frase.isEmpty()) {

					JOptionPane.showMessageDialog(null, "O campo não pode estar vazio \nERRO");

					break;
				}

			} catch (NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "O programa foi encerrado incorretamente \nERRO");

				break;

			}

			contaPalavra.palavras(frase);

		} while (frase != null);

	}

}
