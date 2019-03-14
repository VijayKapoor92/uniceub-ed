package src;

public class Main {
	public static void main(String[] args) {
		int[] vetor = {9, 3, 7, 5, 4, 1};
		Vetor v = new Vetor(vetor);
		v.search(9);
		v.revert(vetor);
		v.findModa(vetor);
	}
}
