public class Produto {
    private String marca;
    private String modelo;
    private float preco;

    public Produto(){}
    public Produto(String marca, String modelo, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nPreço: R$ " + preco;
    }
}
