package Questao_2;

public class Main {
    public static void main(String[] args) {
        // g) Criar no main um objeto do tipo Professor com os dados “mocados”, executar o método mostraProfessor()
        Professor professor = new Professor("Prof. Silva", "silva@example.com", "senha123", 50.0f, 20);
        System.out.println(professor.mostraProfessor());

        // h) Criar um objeto do tipo Aluno com os dados “mocados”, executar o método mostraAluno()
        Aluno aluno = new Aluno("Aluno Silva", "aluno@example.com", "senha456", 3, 101);
        System.out.println(aluno.mostraAluno());
    }
}
