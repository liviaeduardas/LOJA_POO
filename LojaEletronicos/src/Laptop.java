public class Laptop extends Produto{
    private String processador;
    private String so;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String modelo, float preco, String processador, String so) {
        super(marca, modelo, preco);
        this.processador = processador;
        this.so = so;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nProduto: Laptop" +
                "\nProcessador: " + processador +
                "\nSO: " + so + '\n';
    }
}
