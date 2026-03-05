/*
 * Student.h
 *
 *  Created on: Feb 28, 2026
 *      Author: Maroof
 */

#ifndef STUDENT_H_
#define STUDENT_H_

#include<string>
using namespace std;


class Student {
	string name;
	int rollno;
	float marks;
	char grade;

public:
	void acceptInfo();
	void displayInfo();
	void gradeCalculate();
};



#endif /* STUDENT_H_ */
