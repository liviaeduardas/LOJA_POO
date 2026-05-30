public class ItemCarrinho {
    private Produto item;
    private int quantidade;

    public ItemCarrinho(){}

    public ItemCarrinho(Produto item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public Produto getItem() {
        return item;
    }

    public void setItem(Produto item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nItem: " + item.toString() +
                "\nQuantidade: " + quantidade +
                '\n';
    }
}
