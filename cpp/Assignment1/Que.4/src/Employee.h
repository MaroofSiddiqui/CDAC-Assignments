/*
 * Employee.h
 *
 *  Created on: Mar 4, 2026
 *      Author: Maroof
 */

#ifndef EMPLOYEE_H_
#define EMPLOYEE_H_

//#include<string>

class Employee{
	int empID;
	string empName;
	double empSalary;

public:
	void newEmp();
	double calculateGrossSalary();
	void displayEmployeeDetails();
	const string& getEmpName() const;
	void setEmpName(const string &empName);
	double getEmpSalary() const;
	void setEmpSalary(double empSalary);
	int getEmpId() const;
	void setEmpId(int empId);
};




#endif /* EMPLOYEE_H_ */
