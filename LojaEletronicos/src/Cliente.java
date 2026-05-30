public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private Carrinho carrinho;

    public Cliente(){
        this.carrinho = new Carrinho();
    }
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.carrinho = new Carrinho();
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nTelefone: " + telefone + '\n';
    }
}
