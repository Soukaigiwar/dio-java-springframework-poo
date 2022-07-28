import br.com.dio.desafio.Conteudo;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        Conteudo conteudo = new Curso();

        conteudo.setTitulo("Titulo do conteudo");
        conteudo.setDescricao("Descricao do conteudao");
        conteudo.calcularXP();

        curso.setTitulo("Curso bao");
        curso.setDescricao("Curso que faz a gente ficar bao");
        curso.setCargaHoraria(12);

        mentoria.setTitulo("Mentoria da mente");
        mentoria.setDescricao("Mentoria que faz a mente mentalizar");
        mentoria.setData(LocalDate.now());
        System.out.println(curso);
        System.out.println(mentoria);
        //System.out.println(conteudo);
    }
}
