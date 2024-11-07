public class Produto {
    private String nome;
    private String descricao;
    private double valorUnitario;

    public Produto(String descricao, String nome, double valorUnitario) {
        this.descricao = descricao;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }
}