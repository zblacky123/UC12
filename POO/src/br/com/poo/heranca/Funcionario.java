package br.com.poo.heranca;

public class Funcionario extends PessoaFisica {
	private String cargo;
	private String setor;
	public Funcionario() {
	}
	public Funcionario(String cargo, String setor) {
		this.cargo = cargo;
		this.setor = setor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

}
