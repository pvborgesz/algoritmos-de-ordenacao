import java.util.ArrayList;

public class InsertionSort {
    public static void insertionSort(ArrayList<Integer> vetor){
        ArrayList<Integer> vetorOrdenado = new ArrayList<Integer>();
        int menor = 0;
        int chave = 0;
        int j=0;
        for (int i = 1; i< vetor.size(); i ++){
            j = i - 1;
            chave = vetor.get(i);
            while (vetor.get(j) > chave && j>=0){
                vetor.set(j+1,vetor.get(j));
                j--;
            }
            vetor.set(j+1,chave);
        }

    }
}
