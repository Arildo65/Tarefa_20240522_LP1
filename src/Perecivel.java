final class Perecivel extends Produto {
    private String validade;

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Perecivel() {
    }
    
    public Perecivel(String quantidade, String codigo, String descricao, String validade) {
        super(quantidade, codigo, descricao);
        this.validade = validade;
    }

    @Override
    public void mostrar() {
        System.out.println("Código: " + getCodigo() + ", Descrição: " + getDescricao() + ", Quantidade: " + getQuantidade() + ", Validade: " + validade);
    }

    @Override
    public String toString() {
        return "Perecivel{" +
                "validade='" + validade + '\'' +
                ", quantidade='" + getQuantidade() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    @Override
    public void vender() {
        // Implementação do método vender
        System.out.println("Produto perecível vendido!");
    }

    @Override
    public void baixarEstoque() {
        // Implementação do método baixarEstoque
        System.out.println("Estoque de produto perecível baixado!");
    }
}
