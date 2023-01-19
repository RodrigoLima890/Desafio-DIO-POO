package desafiopoo;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Devs dev1 = new Devs("Rodrigo");
        Devs dev2 = new Devs("João");

        Conteudo conteudo1 = new Curso("java básico", "Curso de java básico",8.0);
        Conteudo conteudo2 = new Curso("javaScript básico", "Curso de javaScript básico",4.0);
        Conteudo conteudo3 = new Mentorias
                ("Mentoria Bootcamp", "Mentoria do bootcamp back end", LocalDate.now());

        Set<Conteudo> conteudoSet = new LinkedHashSet<>();
        conteudoSet.add(conteudo1);
        conteudoSet.add(conteudo2);
        conteudoSet.add(conteudo3);

        Bootcamp bootcamp = new Bootcamp("Bootcamp back end","para futuros devs backend");
        bootcamp.setConteudosDoBootcamp(conteudoSet);

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        dev1.progredir();
        System.out.println(dev1);

        System.out.println("---------------------------");

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println(dev2);

    }
}
