package cerveja.model;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="cerveja")
public class Cerveja {

	 @Id
	private String rotulo;
	private double nota;
	private String cervejaria;
	private double preco;
	private double tamanho;
	private String pais;

	private String familia;
	private String estilo;
	private double teor_alcoolico;
	private int ibu;
	private String coloracao;
	private double temperatura;
	private String comentarios;

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getRotulo() {
		return rotulo;
	}

	public void setRotulo(String rotulo) {
		this.rotulo = rotulo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getCervejaria() {
		return cervejaria;
	}

	public void setCervejaria(String cervejaria) {
		this.cervejaria = cervejaria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public double getTeor_alcoolico() {
		return teor_alcoolico;
	}

	public void setTeor_alcoolico(double teor_alcoolico) {
		this.teor_alcoolico = teor_alcoolico;
	}

	public int getIbu() {
		return ibu;
	}

	public void setIbu(int ibu) {
		this.ibu = ibu;
	}

	public String getColoracao() {
		return coloracao;
	}

	public void setColoracao(String coloracao) {
		this.coloracao = coloracao;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
