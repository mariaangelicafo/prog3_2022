public class AlunoGraduacao extends Aluno {
    private int creditosCursados;
    private int anoIngresso;
        
     public AlunoGraduacao(String nome,int credito, int anoI){
         super(nome);
        /*precisa inicilizar nome, pois está no construtor
        da classe herdada*/
        creditosCursados=credito;
        anoIngresso=anoI;
      }
    public int getCreditosCursados() {
        return creditosCursados;
    }

    public void setCreditosCursados(int creditosCursados) {
        this.creditosCursados = creditosCursados;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
    public void imprime(){
    System.out.println("Ano ingesso:"+getAnoIngresso());
    System.out.println("Creditos Cursado"+getCreditosCursados());
    System.out.println("Aluno"+super.getNomeAluno());
    }
    }//fim classe
