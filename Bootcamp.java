package desafiopoo;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataTermino = dataInicio.plusDays(45);

    Set<Devs> devs = new HashSet<>();
    Set<Conteudo> conteudosDoBootcamp = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public Set<Devs> getDevs() {
        return devs;
    }

    public void setDevs(Set<Devs> devs) {
        this.devs = devs;
    }

    public Set<Conteudo> getConteudosDoBootcamp() {
        return conteudosDoBootcamp;
    }

    public void setConteudosDoBootcamp(Set<Conteudo> conteudosDoBootcamp) {
        this.conteudosDoBootcamp = conteudosDoBootcamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataTermino, bootcamp.dataTermino) && Objects.equals(devs, bootcamp.devs) && Objects.equals(conteudosDoBootcamp, bootcamp.conteudosDoBootcamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataTermino, devs, conteudosDoBootcamp);
    }
}
