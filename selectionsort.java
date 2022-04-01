/*
a cada iteração, procura em toda a parcela não ordenada do vetor pelo menor(ou maior) elemento e o coloca em posição correta.Assim, na i-ésima iteração, o i-ésimo menor elemento vai para a posição i, e assim por diante.
*/
public class selectionsort{
    public selectionsort(){

        int i,j=0,aux,menor_index;
        int vetor[] = new int[10];
        System.out.println("DESORDENADO!\n");
        for(i=0;i<vetor.length;i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }
        for(i=0;i<vetor.length-1;i++){
        aux = i;
            for(j = i+ 1;j<vetor.length;j++){
                if(vetor[j] < vetor[aux]){
                    aux = j;
                }
            }
        menor_index = vetor[aux];
        vetor[aux] = vetor[i];
        vetor[i] = menor_index;
        }
        /*SEGUNDA FORMA DE FAZER: for(i=0;i<vetor.length;i++){
            for(j=i+1; j<vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }*/
        System.out.println("\nORDENADO!\n");
        for(i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
    public static void main(String[] args){
        new selectionsort();
    }
}
