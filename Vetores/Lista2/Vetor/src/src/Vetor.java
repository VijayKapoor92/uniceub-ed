package src;
import java.util.Arrays;

public class Vetor {

	private int tamanho;
	public int vetor[];
	
	public Vetor(int[] vetor) {
		this.tamanho = vetor.length;
		this.vetor = new int[tamanho];
		this.vetor = vetor;
	}
	
	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}
	
	public void search(int x) {
		int i = 0;
		int retorno = -1;
		for(i = 0; i < tamanho; i++) {
			if (vetor[i] == x) {
				retorno = 0;
			}
		}
		
		if (retorno != -1) {
			imprime("O numero pesquisado foi achado: " + Integer.toString(x));
		} else {
			imprime("O numero pesquisado não foi achado");
		}
	}
	
	private void imprime(String mensagem) {
		System.out.println(mensagem);
	}
	
	public void revert(int[] array) {
		int tamanho = array.length;
		for(int i = 0;i < Math.round(tamanho/2);i++) {
			int num = array[i];
			array[i] = array[tamanho - 1 - i];
			array[tamanho - 1 - i] = num;
		}
		System.out.println(Arrays.toString(array));
	}
	
	public void findModa(int[] conjunto) {
		int count = 0;
		int num = 0;
		for(int i = 0;i < conjunto.length;i++) {
			for(int j = i+1;j < conjunto.length;j++) {
				if (conjunto[i] == conjunto[j]) {
					num = conjunto[i];
					count++;
				}
			}
		}
		imprime("A moda é: " + Integer.toString(num));
	}

}
