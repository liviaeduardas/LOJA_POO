public class Smartphone extends Produto{
    private int memoria;
    private String cor;

    public Smartphone(String iphone, String xr, float v) {
        super();
    }

    public Smartphone(String marca, String modelo, float preco, int memoria, String cor) {
        super(marca, modelo, preco);
        this.memoria = memoria;
        this.cor = cor;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString()  + "\nProduto: Smartphone" +
                "\nMemoria: " + memoria + "GB" +
                "\nCor: " + cor + '\n';
    }
}
