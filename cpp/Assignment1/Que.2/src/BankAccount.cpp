/*
 * BankAccount.cpp
 *
 *  Created on: Mar 1, 2026
 *      Author: Maroof
 */



#include<iostream>
using namespace std;

#include "BankAccount.h"

void BankAccount::AccountDetail(){
	cout<<"Enter Account Number :- "<<endl;
	cin >> accountNumber;
	cin.ignore();
	cout<<"Enter Account Holder Name :- "<<endl;
	getline(cin, accountHolderName);
	cout<<"Enter Account balance :- "<<endl;
	cin >> balance;

};

void BankAccount::deposit(){
	double amount;
	do {
		cout<<"Enter the amount you want to deposit :- "<<endl;
		cin >> amount;
		if (amount <= 0){
			cout << "Invalid entry!"<<endl;
		}
	} while(amount <= 0);
	setBalance(getBalance() + amount);
	cout << "Your account has been credited with amount Rs."<<amount<<endl;

};


void BankAccount::withdrawal(){
	double amount;
	do {
		cout<<"Enter the amount you want to deposit :- "<<endl;
		cin >> amount;
		if (amount > balance){
		cout << "Insufficient Balance!"<<endl;
		} else if (amount < 0){
			cout<<"Invalid entry!"<<endl;
		}
	} while(amount>balance || amount < 0);
	setBalance(getBalance() - amount);
	cout<<"Rs." <<amount<< " has been deducted from your account."<<endl;
};


int BankAccount::getAccountNumber() const {
	return accountNumber;
}

void BankAccount::setAccountNumber(int accountNumber) {
	this->accountNumber = accountNumber;
}

double BankAccount::getBalance() const {
	return balance;
}

void BankAccount::setBalance(double balance) {
	this->balance = balance;
}

double BankAccount::getCredit() const {
	return credit;
}

void BankAccount::setCredit(double credit) {
	this->credit = credit;
}

double BankAccount::getDebit() const {
	return debit;
}

void BankAccount::setDebit(double debit) {
	this->debit = debit;
}

void BankAccount::displayAccountDetails(){
	cout<<"Your Account Number :- "<<accountNumber<<endl;
	cout<<"Account Holder Name :- "<<accountHolderName<<endl;
	cout<<"Your Account balance :- "<<balance<<endl;
};
