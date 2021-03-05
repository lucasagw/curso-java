package br.curso.java.introducao.controledefluxo;

public class ControleFluxoContinue {
    public static void main(String[] args) {
        // Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        // Porém as parcelas não podem ser menores do que 1.0000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                continue;

            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }


    }
}
