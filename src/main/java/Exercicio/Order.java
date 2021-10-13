package Exercicio;

public class Order {

    public static int[] bubble(int[] vet){
        for(int i =0; i < vet.length-1; i++){
            for(int j=0; j< vet.length-1; j++){
                if(vet[j] > vet[j+1]){
                    int aux;
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        return vet;
    }
}
