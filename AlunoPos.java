public class AlunoPos extends Aluno {
    private int anoIngresso;
    private int prevAnoEgresso;
        
     public AlunoPos(String nome,int anoI, int Pegresso){
        super(nome);
        /*precisa inicilizar nome, pois está no construtor
        da classe herdada*/
        anoIngresso=anoI;
        prevAnoEgresso=Pegresso;
    }
    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getPrevAnoEgresso() {
        return prevAnoEgresso;
    }

    public void setPrevAnoEgresso(int prevAnoEgresso) {
        this.prevAnoEgresso = prevAnoEgresso;
    }
 
    public void imprime(){
    System.out.println(getAnoIngresso());
    System.out.println(getPrevAnoEgresso());
    System.out.println(super.getNomeAluno());
    }
    }
