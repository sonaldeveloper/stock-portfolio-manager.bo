package com.proserus.stocks.model.transactions;

import java.util.Collection;

public interface Label {

	public abstract Integer getId();

	public abstract void setTransactions(Collection<TransactionImpl> transactions);

	//TODO Maybe the same transaction is set...
	public abstract void addTransaction(TransactionImpl t);

	public abstract void removeTransaction(Transaction t);

	public abstract Collection<TransactionImpl> getTransactions();

	public abstract void setName(String name);

	public abstract String getName();

	public abstract int compareTo(Object arg0);

	public abstract boolean equals(Object obj);

}