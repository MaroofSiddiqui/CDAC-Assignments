/*
 * Student.cpp
 *
 *  Created on: Feb 28, 2026
 *      Author: Maroof
 */
#include<iostream>
#include "Student.h"
using namespace std;



void Student::acceptInfo(){
	cout <<"Enter Name :- "<<endl;
	cin >> name;


	do{
		cout <<"Enter Roll No. :- "<<endl;
		cin >> rollno;
		if (rollno < 0){
			cout<<"Invalid roll no."<<endl;
		} else if (cin.fail()){
			cout << "Invalid input! Please enter an integer." << endl;
			cin.clear();
			cin.ignore();
		}} while (rollno < 0);


	cout <<"Enter marks :- "<<endl;
	cin >> marks;
};


void Student::displayInfo(){
	cout <<"Your Name :- "<<name<<endl;
	cout <<"Your Roll No. :- "<<rollno<<endl;
	cout <<"Your marks :- "<<marks<<endl;
	cout <<"Your grade :- "<<grade<<endl;
};

void Student::gradeCalculate(){
	if (marks <= 100 && marks >= 90){
			grade = 'A';
	} else if (marks <= 89 && marks >= 80){
			grade = 'B';
	} else if (marks <= 79 && marks >= 70){
			grade = 'C';
	} else if (marks <= 69 && marks >= 60){
			grade = 'D';
	} else {
			grade = 'F';
	}


};

//
//
//char getGrade() const {
//		return grade;
//	}
//
//	void setGrade(char grade) {
//		this->grade = grade;
//	}
//
//	float getMarks() const {
//		return marks;
//	}
//
//	void setMarks(float marks) {
//		this->marks = marks;
//	}
//
//	const string& getName() const {
//		return name;
//	}
//
//	void setName(const string &name) {
//		this->name = name;
//	}
//
//	int getRollno() const {
//		return rollno;
//	}
//
//	void setRollno(int rollno) {
//		this->rollno = rollno;
//	}

