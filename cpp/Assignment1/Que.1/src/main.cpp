//============================================================================
// Name        : 1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Student.h"
using namespace std;


int main() {
	int task = 0;
	Student s;

	cout<<"1. Accept Information."<<endl;
	cout<<"2. Display Information."<<endl;
	cout<<"3. Calculate Grade."<<endl;
	cout<<"4. Exit the program."<<endl<<endl;

	while(task != 4){
		cout<<"Select the task :- ";
		cin >> task;

		switch(task){
		case 1:
			s.acceptInfo();
			s.gradeCalculate();
			break;
		case 2:
			s.displayInfo();
			break;
		case 3:
			s.gradeCalculate();
			break;
		case 4: break;
		default:
			cout<<"Invalid Task!!!";
			break;
		}
		}
	return 0;
}
