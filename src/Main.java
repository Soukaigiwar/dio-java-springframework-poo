import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Curso bao de Springframework");
        cursoSpring.setDescricao("Curso que faz a gente ficar bao em SpringFramework");
        cursoSpring.setCargaHoraria(12);

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("O curso que te ensina java.");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria da mente");
        mentoria.setDescricao("Mentoria que faz a mente mentalizar");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp master dos bootcamps!");
        bootcampJava.setDescricao("Descricao do bootcamp melhor do universo.");
        bootcampJava.getConteudos().add(cursoSpring);
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoria);

        Dev devSergio = new Dev();
        devSergio.setNome("Sergio");
        devSergio.inscreverBootcamp(bootcampJava);
        System.out.println("Bootcamp inscrito por Sergio: " + devSergio.getConteudosInscritos());
        System.out.println("Bootcamp concluido por Sergio: " + devSergio.getConteudosConcluidos());
        devSergio.progredir();
        System.out.println("Bootcamp inscrito por Sergio: " + devSergio.getConteudosInscritos());
        System.out.println("Bootcamp concluido por Sergio: " + devSergio.getConteudosConcluidos());
        System.out.println("XP: " + devSergio.calcularTotalXP());
        devSergio.progredir();
        System.out.println("Bootcamp concluido por Sergio: " + devSergio.getConteudosConcluidos());
        System.out.println("XP: " + devSergio.calcularTotalXP());
        devSergio.progredir();
        System.out.println("Bootcamp inscrito por Sergio: " + devSergio.getConteudosInscritos());


        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcampJava);
        System.out.println("Bootcamp inscrito por Henrique: " + devHenrique.getConteudosInscritos());
        System.out.println("Bootcamp concluido por Henrique: " + devHenrique.getConteudosConcluidos());
        devHenrique.progredir();
        System.out.println("Bootcamp inscrito por Henrique: " + devHenrique.getConteudosInscritos());
        System.out.println("Bootcamp concluido por Henrique: " + devHenrique.getConteudosConcluidos());
        System.out.println("XP: " + devHenrique.calcularTotalXP());
        System.out.println("Bootcamp concluido por Henrique: " + devHenrique.getConteudosConcluidos());
        System.out.println("XP: " + devHenrique.calcularTotalXP());

    }
}
