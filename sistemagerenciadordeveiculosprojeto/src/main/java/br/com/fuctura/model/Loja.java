package br.com.fuctura.model;

public class Loja {

	private int codigo;
	private String nome;
	private String cnpj;
	private String endereco;
	private Cliente Cliente;
	private Vendedor vendendor;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Vendedor getVendendor() {
		return vendendor;
	}

	public void setVendendor(Vendedor vendendor) {
		this.vendendor = vendendor;
	}

}
