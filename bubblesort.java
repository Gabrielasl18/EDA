public class bubblesort {
    public static void main(String[] args){
       
       int[] vetor = new int[1000];
       int aux;
       for(int i=0;i<vetor.length;i++){
          vetor[i] = (int) (Math.random() * vetor.length);
          System.out.println(vetor[i]);
        }
        System.out.println("\nvetor ordenado:");
        long inicio = System.currentTimeMillis();
        long fim;
        //BUBBLE SORT O(N^2)
        for(int i=0;i<vetor.length;i++){ // O(N)
            for(int j=i+1;j<vetor.length;j++){ // O(N -1)
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        fim = System.currentTimeMillis();
        System.out.println("tempo > " +(fim - inicio) + "\n");
        for(int i=0;i<vetor.length;i++){
        System.out.println(vetor[i]);
        }
    }
}
