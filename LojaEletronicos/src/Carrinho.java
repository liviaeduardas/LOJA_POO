import java.util.ArrayList;

public class Carrinho {
    private Cliente cliente;
    private ArrayList<ItemCarrinho> itens;

    public Carrinho(){
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carrinho(Cliente cliente, ArrayList<ItemCarrinho> itens) {
        this.cliente = cliente;
        this.itens = itens;
    }

    public void adicionarProduto(Produto produto, int quantidade){
        ItemCarrinho item = new ItemCarrinho();

        item.setItem(produto);
        item.setQuantidade(quantidade);

        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;

        for(ItemCarrinho item: itens){
            total += item.getQuantidade() * item.getItem().getPreco();
        }

        return total;
    }

    @Override
    public String toString() {
        String resultado = "\nCARRINHO";

        for(ItemCarrinho item : itens){
            resultado += item + "\n";
        }

        resultado += "Total: R$ " + calcularTotal();

        return resultado;
    }
}
