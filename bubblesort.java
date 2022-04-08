/*
- Comparar pares de elementos adjacentes e os trocar de lugar se estiverem na ordem errada.
- Esse processo se repete até que mais nenhuma troca seja necessária(elementos já ordenados).

    ┌──────────────────────────────────────────────────────────────────┐
    ├──► MELHOR CASO: O(N).                                            │
    ├──► PIOR CASO: O(N^2).                                            │
    ├──► NÃO RECOMENDADO: PARA GRANDES CONJUNTOS DE DADOS.             │
    ├──► INEFICIENTE: PARA GRANDES CONJUNTOS DE DADOS                  │
    └──────────────────────────────────────────────────────────────────┘

*/
import java.util.Random;

public class bubblesort {
    public static void main(String[] args){
        
        int[] numbers = new int[10]; 
        Random rand = new Random();
        for(int i=0;i<numbers.length;i++){
            numbers[i] = rand.nextInt(10000);
        }
        System.out.println("desordenado: ");
        printArray(numbers);
        
        Bubble(numbers);

        System.out.println("ordenado: ");
        printArray(numbers);
       
    }
    private static void Bubble(int inputArray[]){

        int aux=0;
        long start = System.currentTimeMillis();
        long end;
        //BUBBLE SORT O(N^2)
        for(int i=0;i<inputArray.length;i++){ // O(N)
            for(int j=i+1;j<inputArray.length;j++){ // O(N -1)
                if(inputArray[i] > inputArray[j]){
                    aux = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = aux;
                }
            }
        }
        end = System.currentTimeMillis();
        System.out.println("\ntempo > " +(end - start));
    }
    private static void printArray(int inputArray[]){
        for(int i=0;i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
    }
}
