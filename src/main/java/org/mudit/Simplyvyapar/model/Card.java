package org.mudit.Simplyvyapar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.mudit.Simplyvyapar.configuration.CardType;

@Entity
@XmlRootElement
public class Card {
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String cardNumber;
	private String cvv;
	private int expriyMonth;
	private int expriryYear;
	private String nameOnCard;
	private Address billingAddress;
	private CardType cardType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public int getExpriyMonth() {
		return expriyMonth;
	}
	public void setExpriyMonth(int expriyMonth) {
		this.expriyMonth = expriyMonth;
	}
	public int getExpriryYear() {
		return expriryYear;
	}
	public void setExpriryYear(int expriryYear) {
		this.expriryYear = expriryYear;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	public CardType getCardType() {
		return cardType;
	}
	
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	
	
}
