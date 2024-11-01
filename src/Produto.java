public class Produto {
    private double preco;
    private String categoria;
    private String nome;
    public Produto(double preco, String categoria, String nome) {
        this.preco = preco;
        this.categoria = categoria;
        this.nome = nome; 
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Produto [preco=" + preco + ", categoria=" + categoria + ", nome=" + nome + "]";
    }
  
   
}