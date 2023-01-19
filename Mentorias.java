package desafiopoo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentorias extends Conteudo{

    private String nome;
    private String descricao;
    private LocalDate dataMentoria;

    public Mentorias(String nome, String descricao, LocalDate dataMentoria) {
        super(nome, descricao);
        this.nome = nome;
        this.descricao = descricao;
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Mentoria: " +
                "nome: " + nome + '\'' +
                ", descricao: '" + descricao + '\'' +
                ", data da Mentoria: " + dataMentoria;
    }
}
