import java.util.Objects;
//O programa deve tratar dados em árvore de um atleta de vôlei 
//de areia (nome, apelido, altura e posição (entrada ou saída)).
public class Atleta implements Comparable<Atleta>{
    private String nome;
    private String apelido;
    private String data;
    private String posicao;
    private double altura;
    

    
    public Atleta(String nome, String apelido, String data, String posicao, double altura) {
		this.nome = nome;
		this.apelido = apelido;
		this.data = data;
		this.posicao = posicao;
		this.altura = altura;
	}

	
    


	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getApelido() {
		return apelido;
	}





	public void setApelido(String apelido) {
		this.apelido = apelido;
	}





	public String getData() {
		return data;
	}





	public void setData(String data) {
		this.data = data;
	}





	public String getPosicao() {
		return posicao;
	}





	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}





	public double getAltura() {
		return altura;
	}





	public void setAltura(double altura) {
		this.altura = altura;
	}





	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", apelido=" + apelido + ", data=" + data + ", posicao=" + posicao + ", altura="
				+ altura + "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(altura, apelido, data, nome, posicao);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		return Objects.equals(altura, other.altura) && Objects.equals(apelido, other.apelido)
				&& Objects.equals(data, other.data) && Objects.equals(nome, other.nome)
				&& Objects.equals(posicao, other.posicao);
	}





	@Override
	public int compareTo(Atleta outroAtleta) {
        return Double.compare(outroAtleta.altura, this.altura);
    }

}
