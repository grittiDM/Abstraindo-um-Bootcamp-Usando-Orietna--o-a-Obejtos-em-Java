import br.com.grittiDM.desafio.dominio.Bootcamp;
import br.com.grittiDM.desafio.dominio.Curso;
import br.com.grittiDM.desafio.dominio.Dev;
import br.com.grittiDM.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição: curso sobre desenvolvimento Back-end em Java.");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição: curso sobre desenvolvimento Back-end em Python.");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de gestão de tempo");
        mentoria.setDescricao("Descrição: mentoria sobre o aprimoramento de gestão de tempo pessoal");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev muriloGritti = new Dev();
        muriloGritti.setNome("Murilo Gritti");
        muriloGritti.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Murilo Gritti:" + muriloGritti.getConteudosInscritos());
        muriloGritti.progredir();
        muriloGritti.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Murilo Gritti:" + muriloGritti.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Murilo Gritti:" + muriloGritti.getConteudosConcluidos());
        System.out.println("XP:" + muriloGritti.calcularTotalXp());

        System.out.println("---- PRÓXIMO ----");

        Dev anaClara = new Dev();
        anaClara.setNome("Ana Clara");
        anaClara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana Clara:" + anaClara.getConteudosInscritos());
        anaClara.progredir();
        anaClara.progredir();
        anaClara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana Clara:" + anaClara.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ana Clara:" + anaClara.getConteudosConcluidos());
        System.out.println("XP:" + anaClara.calcularTotalXp());

    }
}