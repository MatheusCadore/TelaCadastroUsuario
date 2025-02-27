package Model;

public class Usuario {

    private int id;
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;

    public Usuario(int id, String nome, String sobrenome, int idade, String cpf, String telefone, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "id= " + id +
                ", nome= '" + nome + '\'' +
                ", sobrenome= '" + sobrenome + '\'' +
                ", idade= " + idade +
                ", cpf= " + cpf +
                ", telefone= " + telefone +
                ", email= '" + email + '\'' +
                ", senha= '" + senha + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
