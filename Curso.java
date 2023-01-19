package desafiopoo;

public class Curso extends Conteudo{
    private String nome;
    private String descricao;
    private Double cargaHoraria;

    public Curso(String nome, String descricao, Double cargaHoraria) {
        super(nome,descricao);
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
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
        return "Curso: " +
                "nome: '" + nome + '\'' +
                ", descrição: '" + descricao + '\'' +
                ", carga Horaria: " + cargaHoraria;
    }
}
