//============================================================================
// Name        : 2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

#include "BankAccount.h"


int main() {
	int request;

	BankAccount user1;

	user1.AccountDetail();
	cout<<endl;

	do {

		cout <<"1. Deposit money into an existing account." << endl;
		cout <<"2. Withdraw money from an existing account." << endl;
		cout <<"3. Display the account details." << endl;
		cout <<"4. Exit the program." << endl<<endl;
		cout <<"Select the request :- ";
		cin >> request;

		switch(request){
		case 1:
			user1.deposit();
			break;
		case 2:
			user1.withdrawal();
			break;
		case 3:
			user1.displayAccountDetails();
			break;
		case 4:
			cout<<"THANK YOU";
			break;
		default :
			cout << "Invalid entry!!!"<<endl;;
		}
	} while (request != 4);

	return 0;
}
