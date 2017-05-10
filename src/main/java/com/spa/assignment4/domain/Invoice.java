package com.spa.assignment4.domain;

public class Invoice {
	
	public enum InvoiceType {
		DOMESTIC, CROSS_BORDER
	}
	
	private InvoiceType invoiceType;
	private String senderAccount;
	private String receiverAccount;
	private double amount;
	
	public Invoice(InvoiceType invoiceType, String senderAccount, String receiverAccount, double amount) {
		this.invoiceType = invoiceType;
		this.senderAccount = senderAccount;
		this.receiverAccount = receiverAccount;
		this.amount = amount;
	}
	
	public InvoiceType getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(InvoiceType invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getSenderAccount() {
		return senderAccount;
	}
	public void setSenderAccount(String senderAccount) {
		this.senderAccount = senderAccount;
	}
	public String getReceiverAccount() {
		return receiverAccount;
	}
	public void setReceiverAccount(String receiverAccount) {
		this.receiverAccount = receiverAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceType=" + invoiceType + ", senderAccount=" + senderAccount + ", receiverAccount="
				+ receiverAccount + ", amount=" + amount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((invoiceType == null) ? 0 : invoiceType.hashCode());
		result = prime * result + ((receiverAccount == null) ? 0 : receiverAccount.hashCode());
		result = prime * result + ((senderAccount == null) ? 0 : senderAccount.hashCode());
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
		Invoice other = (Invoice) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (invoiceType != other.invoiceType)
			return false;
		if (receiverAccount == null) {
			if (other.receiverAccount != null)
				return false;
		} else if (!receiverAccount.equals(other.receiverAccount))
			return false;
		if (senderAccount == null) {
			if (other.senderAccount != null)
				return false;
		} else if (!senderAccount.equals(other.senderAccount))
			return false;
		return true;
	}
	
	
	
}
