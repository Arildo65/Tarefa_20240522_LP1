final class Vestuario extends Produto {
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Vestuario() {
    }

    public Vestuario(String quantidade, String codigo, String descricao, String tamanho) {
        super(quantidade, codigo, descricao);
        this.tamanho = tamanho;
    }

    @Override
    public void mostrar() {
        System.out.println("Código: " + getCodigo() + ", Descrição: " + getDescricao() + ", Quantidade: " + getQuantidade() + ", Tamanho: " + tamanho);
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "tamanho='" + tamanho + '\'' +
                ", quantidade='" + getQuantidade() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    @Override
    public void vender() {
        // Implementação do método vender
        System.out.println("Produto de vestuário vendido!");
    }

    @Override
    public void baixarEstoque() {
        // Implementação do método baixarEstoque
        System.out.println("Estoque de produto de vestuário baixado!");
    }
}
