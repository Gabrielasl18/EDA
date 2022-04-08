/*
- Similar a ordenação de cartas de baralho com as mãos.
- Pega-se uma carta de cada vez e a coloca em seu devido lugar, sempre deixando as cartas da mão em ordem
     PERFORMANCE:
    ┌──────────────────────────────────────────────────────────────────┐
    ├──► MELHOR CASO: O(N).                                            │
    ├──► PIOR CASO: O(N^2).                                            │                
    ├──► ESTÁVEL: não altera a ordem de dados iguais                   │
    ├──► Eficiente: para conjuntos pequenos de dados                   │
    ├──► Capaz de ordenar os dados a medida em que recebe(tempo real)  │
    └──────────────────────────────────────────────────────────────────┘
*/

public class insertionsort {
    public static void main(String args[]){

        int numbers[] = new int[1000];
        int i;

        for(i=0;i<numbers.length;i++){
            numbers[i] = (int) (Math.random() * numbers.length);
        }
        System.out.println("desordenado: ");
        printArray(numbers);

        Insertion(numbers);
        
        System.out.println("\nordenado: ");
        printArray(numbers);
    }
    private static void Insertion(int inputArray[]){
        int j=0,i=0,aux=0;
        long start = System.currentTimeMillis();
        long end;
        for(i=0;i<inputArray.length;i++){
            aux = i;
            j = i - 1;
            if(j>=0 && aux<inputArray[j]){
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j+1] = aux;
        }
        end = System.currentTimeMillis();
        System.currentTimeMillis();
        System.out.println("\ntempo > " + (end - start));     
    }
    private static void printArray(int inputArray[]){
        for(int i=0;i<inputArray.length;i++){
            System.out.println(inputArray[i]);
            }
    }
}
