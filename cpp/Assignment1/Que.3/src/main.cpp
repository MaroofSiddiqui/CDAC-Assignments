//============================================================================
// Name        : 3.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include "TollBooth.h"
int main() {
	int entry;

	TollBooth vehicle;
	do {

		cout<<"1. Add a standard car and collect toll."<<endl;
		cout<<"2. Add a truck and collect toll."<<endl;
		cout<<"3. Add a bus and collect toll."<<endl;
		cout<<"4. Display total cars passed."<<endl;
		cout<<"5. Display total revenue collected."<<endl;
		cout<<"6. Reset booth statistics."<<endl;
		cout<<"7. Exit."<<endl;
		cout<<"Select the task :- "<<endl;
		cin >> entry;


		switch(entry){
			case 1:
				vehicle.vehiclePayingToll(1,180);
				break;
			case 2:
				vehicle.vehiclePayingToll(2,300);
				break;
			case 3:
				vehicle.vehiclePayingToll(3,350);
				break;
			case 4:
				vehicle.getTotalVehicles();
				break;
			case 5:
				vehicle.getTotalRevenue();
				break;
			case 6:
				vehicle.reset();
				break;
			case 7:
				cout<<"Thank you for visiting..."<<endl;
				break;
			default:
				cout<<"Invalid entry!"<<endl;
				break;
		}
	} while(entry != 7);
	return 0;
}
