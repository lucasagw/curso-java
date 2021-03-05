package br.curso.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

    // public void relatorioPagamentoGerente(Gerente gerente) {
    //   System.out.println("Gerando relatório do pagamento para a gerencia");
    // gerente.cslcularPagamento();
    // System.out.println("Nome: " + gerente.getNome());
    //   System.out.println("Salario desse mês: " + gerente.getSalario());


    //}

    //public void relatorioPagamentoVendedor(Vendedor vendedor) {
    //   System.out.println("Gerando relatório do pagamento para os vendedores");
    //  vendedor.cslcularPagamento();
    // System.out.println("Nome: " + vendedor.getNome());
    // System.out.println("Salario desse mês: " + vendedor.getSalario());
    // }

    public void relatorioPagamentoGenerico(Funcionario funcionario) { //polimorfissmo
        System.out.println("Gerando o relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario desse mês: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação nos lucros: " + g.getPnl());

        }
        if (funcionario instanceof Vendedor) {
            // Vendedor v = (Vendedor) funcionario;
            System.out.println("Total vendas: " + ((Vendedor) funcionario).getTotalVendas()); //cast direto! Bom pra o caso que so precisa usar uma vez, dai n precisa ter variavel de referencia.

        }

    }

}