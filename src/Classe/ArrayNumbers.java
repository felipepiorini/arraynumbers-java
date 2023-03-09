package Classe;
// @author Felipe Piorini

import java.util.Random;

public class ArrayNumbers {

    private int numbers[];
    private int contN;

    public ArrayNumbers(int qtde) {
        numbers = new int[qtde];
        contN = 0; // controla a quatidade de numeros inseridos 
    }

    public ArrayNumbers() { //espaço de 10 numero pre definindo a quantidade de espaço
        numbers = new int[10];
        contN = 0;
    }

    public int add(int num) { // metodo para adicionar numero 
        if (contN < numbers.length) {//.lengh = tamanho do vetor
            numbers[contN] = num;
            contN++;
            return 1;
        } else {
            return 0;
        }
    } // 1 = armazenou 0 = NAO armazenou   

    public void geraVetor() {
        Random nRandom = new Random();
        for (contN = 0; contN < numbers.length; contN++) {
            numbers[contN] = nRandom.nextInt(50);
        }
    }

    public int somaVetor() {
        int soma = 0;
        for (int i = 0; i < contN; i++) {
            soma = soma + numbers[i];
        }
        return soma;
    }

    public void inverterVetor() {

        int aux = contN - 1;
        for (int i =0; i < contN/2; i++){
            int temp = numbers[i];
            numbers[i]=numbers[aux];
            numbers[aux]=temp;
            aux--;
        }
    }

    @Override
    public String toString() { //mostra as informacoes do array
        String dados = "Valores: \n";
        for (int i = 0; i < contN; i++) {
            dados += numbers[i] + "\t";
        }

        return dados;

    }
}// fim da classe
