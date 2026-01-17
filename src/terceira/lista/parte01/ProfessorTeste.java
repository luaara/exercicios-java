package terceira.lista.parte01;

public class ProfessorTeste {

    //Testando polimorfismo, classes e métodos abstratos, sobrecarga, encapsulamento e interface

    public static void main(String[] args) {
        Professor p = new Professor("João", 35);
        Pessoa p1 = new Professor("Maria", "Silva", 42);
        Professor p2 = new Professor("Joana", "Santos", 28, "Matemática");
        Pessoa p3 = new Professor("Joana", "Santos", 28, "Matemática");

        // Professor do tipo professor
        // p
        System.out.println("----- professor p -----");

        System.out.println("----- saudação -----");
        p.saudar();

        System.out.println("----- avaliação -----");
        p.avaliar();

        System.out.println("----- informações -----");
        System.out.println(p.getNome());
        System.out.println(p.getIdade());

        System.out.println(" ");

// Professor do tipo Pessoa
// p1, p2 e p3
        System.out.println("----- professor p1 -----");

        System.out.println("----- saudação -----");
        p1.saudar();

        System.out.println("----- avaliação -----");
        if (p1 instanceof Avaliavel) {
            ((Avaliavel) p1).avaliar();
        }

        System.out.println("----- informações -----");
        System.out.println(p1.getNome());
        System.out.println(p1.getSobrenome());
        System.out.println(p1.getIdade());

        System.out.println(" ");

        System.out.println("----- professor p2 -----");

        System.out.println("----- saudação -----");
        p2.saudar();

        System.out.println("----- avaliação -----");
        p2.avaliar();

        System.out.println("----- informações -----");
        System.out.println(p2.getNome());
        System.out.println(p2.getSobrenome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getDisciplina());

        System.out.println(" ");

        System.out.println("----- professor p3 -----");
        System.out.println("----- discplina -----");
        if (p3 instanceof Professor) {
            Professor prof = (Professor) p3;
            System.out.println(prof.getDisciplina());
        }
    }

}
