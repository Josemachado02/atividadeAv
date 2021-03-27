package Classes;

public class Contato {
    private String nome;
    private int codigo;
    private int telefone;
    private String cadastrar; 
    
    
    //region
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    //#endregion
    
    public String getCadastrar() {
        return cadastrar;
    }
    public void setCadastrar(String cadastrar) {
        this.cadastrar = cadastrar;
    }

    
}
