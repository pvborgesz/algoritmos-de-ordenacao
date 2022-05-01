import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,4,5,6,12,321};
        System.out.println("vetor antes de ser ordenado: ");
        for ( int i : array ) System.out.println(i);


        mergeSort(array);
        System.out.println("vetor depois de ser ordenado: ");
        for ( int i : array ) System.out.println(i);

    }


    public static int[] mergeSort(int[] array){
        int[] temp = new int[array.length];
        return mergeMain(array, temp, 0, array.length-1);
    }

    public static int[] mergeMain( int[] array, int[] temp, int esq, int dir){
        int meio;

        if (esq < dir){
            meio = (esq + dir)/2;

            mergeMain(array, temp, esq, meio); //
            mergeMain(array, temp, meio+1, dir);
            merge(array, temp, esq, meio+1, dir);
        }

        return array;
    }

    public static void merge(int[] array, int[] temp, int esqPos, int dirPos, int dirFim){
        int esqFim = dirPos - 1;
        int tempPos = esqPos;
        int numElem = dirFim - esqPos + 1;

        while (esqPos <= esqFim && dirPos <= dirFim){
            if (array[esqPos] <= array[dirPos]){
                temp[tempPos++] = array[esqPos];
            } else {
                temp[tempPos++] = array[dirPos++];
            }
        }

        while (esqPos <= esqFim){
            temp[tempPos++] = array[esqPos++];
        }
        while (dirPos <= dirFim){
            temp[tempPos++] = array[dirPos];
        }

        for (int i=0; i< numElem; i++, dirFim--){
            array[dirFim] = temp[dirFim];
        }
    }

    /*
    public static ArrayList<Integer> mergeSort1(ArrayList<Integer> array){
        ArrayList<Integer> vetorOrdenado = new ArrayList<>();
        ArrayList<Integer> aux1 = new ArrayList<>();
        ArrayList<Integer> aux2 = new ArrayList<>();
        int tamVetor = array.size();
        int maior = 0;
        int menor = 0;

        for(int i = 0; i < tamVetor; i++){
            if (i < tamVetor/2) aux1.add(array.get(i));
            else aux2.add(array.get(i));
        }

        for (int i=0; i<tamVetor; i++){
            if (aux1.get(i) < aux2.get(i)){ //se o termo do vetor 1 for maior que o do vetor 2
                maior = aux2.get(i);
                menor = aux1.get(i);

            } else {
                maior = aux1.get(i);
                menor = aux2.get(i);
            }

        }

        return vetorOrdenado;
    }
    */
}



