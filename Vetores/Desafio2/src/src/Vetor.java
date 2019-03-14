package src;
import java.util.Arrays;

public class Vetor {

	private int tamanho_max = 10;
	private int tamanho_atual;
	public String vetor[];
	
	public Vetor(String[] array) {
		this.tamanho_atual = this.getTamanhoArrayPreenchida(array);
		this.vetor = new String[tamanho_atual];
		this.vetor = array;
	}
	
	public int getTamanhoArrayPreenchida(String[] array) {
		int count = 0;
		for(int i=0;i<array.length;i++) {
			if (array[i] != "") {
				count++;
			}
		}
		return count;
	}

	public String[] getVetor() {
		return vetor;
	}

	public void setVetor(String[] vetor) {
		this.vetor = vetor;
	}
	
	public void searchInListaTelefonica(String x) {
		searchInArray(x);
	}
	
	public void searchInArray(String x) {
		int i = 0;
		int retorno = -1;
		for(i = 0; i < tamanho_atual; i++) {
			if (vetor[i] == x) {
				retorno = 0;
			}
		}
		
		if (retorno != -1) {
			System.out.println("O numero pesquisado foi achado: " + x);
		} else {
			System.out.println("O numero pesquisado não foi achado");
		}
	}
	
	private boolean isInArray(String x) {
		int i = 0;
		int total = vetor.length;
		boolean retorno = false;
		for(i = 0; i < total; i++) {
			if (vetor[i] == x) {
				retorno = true;
			}
		}
		
		return retorno;
	}
	
	public void insertIntoArray(String contato) {
		if (tamanho_atual != tamanho_max && !isInArray(contato)) {
			tamanho_atual++;
			vetor[tamanho_atual-1] = contato;
			imprime(Arrays.toString(vetor));
		} else if(tamanho_atual == tamanho_max && !isInArray(contato)){
			imprime("Lista telefônica está cheia, se quiser adicionar terá que remover algum número");
		} else {
			imprime("Esse número já existe, adicione outro.");
		}
	}
	
	public void insertIntoListaTelefonica(String contato) {
		insertIntoArray(contato);
	}
	
	public void removeFromListaTelefonica(String contato) {
		if (tamanho_atual != 0) {
			tamanho_atual--;
			for(int i=0;i<tamanho_atual;i++) {
				if (isInArray(contato) && i != tamanho_atual) {
					vetor[i] = vetor[i+1];
					vetor[i+1] = "";
				} else if (i != tamanho_atual) {
					vetor[i] = vetor[i+1];
					vetor[i+1] = "";
				} else {
					vetor[i] = "";
				}
			}
			imprime(Arrays.toString(vetor));
		} else {
			imprime("Lista telefônica já está vazia");
		}
	}
	
	private void imprime(String mensagem) {
		System.out.println(mensagem);
	}

}

