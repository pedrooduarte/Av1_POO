package Questao_2;

public class Aluno {
    private int periodo;
    private int turma;

    public Aluno(String nome, String email, String senha, int periodo, int turma) {
        super(nome, email, senha);
        this.periodo = periodo;
        this.turma = turma;
    }

    public String mostraAluno() {
        return "Nome: " + getNome() + ", Email: " + getEmail() + ", Período: " + periodo + ", Turma: " + turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
}
