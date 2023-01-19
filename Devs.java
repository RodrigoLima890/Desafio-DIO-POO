package desafiopoo;

import java.util.*;

public class Devs {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Devs(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        conteudosInscritos.addAll(bootcamp.conteudosDoBootcamp);
        bootcamp.devs.add(this);
    }

    public double calcularTotalXp(){
        return conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }
    public void removerConteudo(Conteudo conteudo){
        conteudosInscritos.remove(conteudo);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();//Conteudos devem ser terminados em sequencia

        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            removerConteudo(conteudo.get());

        } else {
            System.err.println("Sem Conteúdos inscritos");
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(conteudosInscritos, devs.conteudosInscritos) && Objects.equals(conteudosConcluidos, devs.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "nome: " + nome + '\n' +
                "conteudosInscritos:" + conteudosInscritos +"\n"+
                "conteudosConcluidos:" + conteudosConcluidos +"\n"+
                "XP: "+calcularTotalXp();
    }
}
