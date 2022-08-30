public class Aluno {
    private String nomeAluno;
// construtor inicializa com String fornecida como argumento
    public Aluno(String name) {
        nomeAluno = name; // inicializa nomeAluno
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
