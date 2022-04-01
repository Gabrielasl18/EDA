public class insertionsort {
    public static void main(String args[]){

        int vetor[] = new int[1000];
        int i,j,aux;

        System.out.println("desordenado:\n");
        for(i=0;i<vetor.length;i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }
        System.out.println("\nordenado:");
        long inicio = System.currentTimeMillis();
        long fim;
        for(i=0;i<vetor.length;i++){
            aux = i;
            j = i - 1;
            if(j>=0 && aux<vetor[j]){
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j+1] = aux;
        }
        fim = System.currentTimeMillis();
        System.currentTimeMillis();
        System.out.println("tempo > " + (fim - inicio) + "\n");
        for(i=0;i<vetor.length;i++){
        System.out.println(vetor[i]);
        }
    }
}
