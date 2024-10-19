package Bop-Code;

public class Participante {
    private String nome;
    private int numero;
    private String cidade;

    // Construtor
    public Participante(String nome, int numero, String cidade) {
        this.nome = nome;
        this.numero = numero;
        this.cidade = cidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Método para exibir informações do participante
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Número: " + numero);
        System.out.println("Cidade: " + cidade);
    }
}
    
}
