package br.com.bk.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Score {

	public Score() {
		
	}
	
	public Score(String id, String cpf, Endereco endereco, List<BemMaterial> listaBens, List<FonteRenda> fonteRenda) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.endereco = endereco;
		this.listaBens = listaBens;
		this.fonteRenda = fonteRenda;
	}

	@Id
	private String id;
	private String cpf;
	
	private Endereco endereco;
	
	private List<BemMaterial> listaBens;
	
	private List<FonteRenda> fonteRenda;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<BemMaterial> getListaBens() {
		return listaBens;
	}

	public void setListaBens(List<BemMaterial> listaBens) {
		this.listaBens = listaBens;
	}

	public List<FonteRenda> getFonteRenda() {
		return fonteRenda;
	}

	public void setFonteRenda(List<FonteRenda> fonteRenda) {
		this.fonteRenda = fonteRenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((fonteRenda == null) ? 0 : fonteRenda.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listaBens == null) ? 0 : listaBens.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (fonteRenda == null) {
			if (other.fonteRenda != null)
				return false;
		} else if (!fonteRenda.equals(other.fonteRenda))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaBens == null) {
			if (other.listaBens != null)
				return false;
		} else if (!listaBens.equals(other.listaBens))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", cpf=" + cpf + ", endereco=" + endereco + ", listaBens=" + listaBens
				+ ", fonteRenda=" + fonteRenda + "]";
	}
	
}
