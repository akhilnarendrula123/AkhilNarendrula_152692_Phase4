package com.cg.paymentwallet.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Wallet implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal balance;
	public Wallet(BigDecimal balance)
	{
	super();
	this.balance = balance;
	
	}
@Override
public String toString() {
	return "Wallet [balance=" + balance +"]";
} 
 

	public Wallet() {
		super();
	}
	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
}
