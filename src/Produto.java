abstract class Produto implements Vendas {

    private String quantidade;
    private String codigo;
    private String descricao;

    public Produto() {
    }

    public Produto(String quantidade, String codigo, String descricao) {
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract void mostrar();

    @Override
    public abstract String toString();
}
