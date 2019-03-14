package src;

public class Main {

	public static void main(String[] args) {
		//Declara a lista telefonica e instacia um novo vetor
		String[] array = {"9979-0977", "9887-5697", "", "", "", "", "", "", "", ""};
		Vetor vetor = new Vetor(array);
		
		//1.Buscar um determinado telefona
		vetor.searchInListaTelefonica("9979-0977");
		//2.Inserir um novo telefone
		vetor.insertIntoListaTelefonica("8888-8888");
		//3.Remover um determinado telefone
		vetor.removeFromListaTelefonica("9979-0977");
		//4.Inserir um novo telefone
		vetor.insertIntoListaTelefonica("8888-8888");
	}
}
