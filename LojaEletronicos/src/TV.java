public class TV extends Produto{
    private int tamanho;
    private String resolucao;

    public TV() {
        super();
    }

    public TV(String marca, String modelo, float preco, int tamanho, String resolucao) {
        super(marca, modelo, preco);
        this.tamanho = tamanho;
        this.resolucao = resolucao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nProduto: TV" +
                "\nTamanho: " + tamanho +
                "\nResolucao: " + resolucao + '\n';
    }
}
