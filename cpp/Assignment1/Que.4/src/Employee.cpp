/*
 * Employee.cpp
 *
 *  Created on: Mar 4, 2026
 *      Author: Maroof
 */


#include <iostream>
using namespace std;
#include "Employee.h"

double Employee::calculateGrossSalary(){

	double grossSalary = empSalary;

	if (empSalary <= 5000){
		grossSalary += (empSalary/100)*10;
	} else if (empSalary <= 10000){
		grossSalary += (empSalary/100)*15;
	} else {
		grossSalary += (empSalary/100)*20;
	}
	return grossSalary;
}

void Employee::newEmp(){
	cout<<"Employee Id :- "<<endl;
	cin >> empID;
	cout<<"Employee Name :- "<<endl;
	cin >> empName;
	cout<<"Employee Salary :- "<<endl;
	cin >> empSalary;
}

void Employee::displayEmployeeDetails(){
	cout<<"Employee Name :- "<< empName <<endl;
	cout<<"Employee ID :- "<< empID <<endl;
	cout<<"Employee Salary :- "<< empSalary <<endl;
	cout<<"Employee Gross Salary :- "<< Employee::calculateGrossSalary() <<endl;
}



const string& Employee::getEmpName() const {
	return empName;
}

void Employee::setEmpName(const string &empName) {
	this->empName = empName;
}

double Employee::getEmpSalary() const {
	return empSalary;
}

int Employee::getEmpId() const {
	return empID;
}

void Employee::setEmpId(int empId) {
	empID = empId;
}

void Employee::setEmpSalary(double empSalary) {
	this->empSalary = empSalary;
}






