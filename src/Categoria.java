public class Categoria extends Produto{
    int quantidade;
    String tipo;
    public Categoria(double preco, String categoria, String nome, int quantidade, String tipo) {
        super(preco, categoria, nome);
        this.quantidade = quantidade;
        this.tipo = tipo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return super.toString()+"Categoria [quantidade=" + quantidade + ", tipo=" + tipo + "]";
    }
   
    
}
