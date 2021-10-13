package Exercicio;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OrderTest {

    @Test
    public void ordenacaoNormalBubbleSort() {
        int[] vet = {8, 6, 5, 3, 9, 2};
        int[] result = Order.bubble(vet);
        int[] test = {2, 3, 5, 6, 8, 9};
        for (int i = 0; i < result.length; i++) {
            assertEquals(test[i], result[i]);
        }
    }

    @Test
    public void vetorOrdenadoBubbleSort(){
        int[] vet = {1, 2, 3, 4, 5, 6};
        int[] result = Order.bubble(vet);
        int[] test = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < result.length; i++) {
            assertEquals(test[i], result[i]);
        }

    }

    @Test
    public void vetorZeroPosicao(){
        int[] vet = {};
        int[] result = Order.bubble(vet);
        int[] test = {};
        for (int i = 0; i < result.length; i++) {
            assertEquals(test[i], result[i]);
        }
    }

    @Test
    public void vetorOrdenadoContrario(){
        int[] vet = {9,8,7,6,5,4,3};
        int[] result = Order.bubble(vet);
        int[] test = {3,4,5,6,7,8,9};
        for (int i = 0; i < result.length; i++) {
            assertEquals(test[i], result[i]);
        }
    }

}