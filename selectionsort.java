/*
- A cada passo, procura o menor valor do array e o coloca na primeira posição do array.
- Descarta-se a primeira posição do array e repete-se o processo para a segunda posição.
- Isso é feito para todas as posicões do array.

    PERFORMANCE:
  ┌──────────────────────────────────────────────────────────────────┐
  ├──► MELHOR CASO: O(N^2).                                          │
  ├──► PIOR CASO: O(N^2).                                            │
  ├──► ESTÁVEL: não altera a ordem de dados iguais                   │
  ├──► INEFICIENTE: PARA GRANDES CONJUNTOS DE DADOS                  │
  └──────────────────────────────────────────────────────────────────┘


*/
public class selectionsort{
    public static void main(String[] args){
        int numbers[] = new int[1000];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = (int) (Math.random() * numbers.length);
        }
        System.out.println("desordenado: ");
        printArray(numbers);

        Selection(numbers);
        
        System.out.println("\nordenado: ");
        printArray(numbers);

    }
    private static void Selection(int[] inputArray){

        int aux=0,menor_index;
        long start = System.currentTimeMillis();
        long end;
        for(int i=0;i<inputArray.length-1;i++){
        aux = i;
            for(int j = i+ 1;j<inputArray.length;j++){
                if(inputArray[j] < inputArray[aux]){
                    aux = j;
                }
            }
        menor_index = inputArray[aux];
        inputArray[aux] = inputArray[i];
        inputArray[i] = menor_index;
        }
        end = System.currentTimeMillis();
        System.out.println("tempo > " + (end - start) + "\n");
        /*SEGUNDA FORMA DE FAZER: for(i=0;i<vetor.length;i++){
            for(j=i+1; j<vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }*/
    }
    private static void printArray(int inputArray[]){
        for(int i=0;i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
    }
}