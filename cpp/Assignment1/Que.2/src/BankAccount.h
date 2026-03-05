/*
 * BankAccount.h
 *
 *  Created on: Mar 1, 2026
 *      Author: Maroof
 */

#ifndef BANKACCOUNT_H_
#define BANKACCOUNT_H_


#include<string>
using namespace std;

class BankAccount{

	int accountNumber;
	string accountHolderName;
	double balance;
	double credit;
	double debit;

public:

	void deposit();
	void withdrawal();
	void AccountDetail();
	void displayAccountDetails();
	int getAccountNumber() const;
	void setAccountNumber(int accountNumber);
	double getBalance() const;
	void setBalance(double balance);
	double getCredit() const;
	void setCredit(double credit);
	double getDebit() const;
	void setDebit(double debit);
};



#endif /* BANKACCOUNT_H_ */
