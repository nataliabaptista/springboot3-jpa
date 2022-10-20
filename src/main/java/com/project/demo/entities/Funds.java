package com.project.demo.entities;

import java.io.Serializable;
import java.util.Objects;

public class Funds implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer account;
	private Integer agency;
	private Integer bank;

	public Funds() {

	}

	public Funds(Long id, Integer account, Integer agency, Integer bank) {
		super();
		this.id = id;
		this.account = account;
		this.agency = agency;
		this.bank = bank;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Integer getAgency() {
		return agency;
	}

	public void setAgency(Integer agency) {
		this.agency = agency;
	}

	public Integer getBank() {
		return bank;
	}

	public void setBank(Integer bank) {
		this.bank = bank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funds other = (Funds) obj;
		return Objects.equals(id, other.id);
	}
	
}
