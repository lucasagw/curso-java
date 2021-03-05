package br.curso.javacore.Kenum.classes;

// constant specific class body
public enum TipoCliente {
    // constant specific class body
    PESSOA_FISICA(1, "Pessoa Física"), ESSOA_JURIDICA(2, "Pessoa Jurídica") {
        public String getId() {
            return "B";
        }

    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId() {
        return "A";
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}