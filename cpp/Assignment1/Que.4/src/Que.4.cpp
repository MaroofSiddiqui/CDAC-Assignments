//============================================================================
// Name        : 4.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include "Employee.h"

int main() {

    Employee emp[100];
    int empCount = 0;

    int task;

    do {
        cout << "\n1. Add New Employee." << endl;
        cout << "2. Calculate Gross Salary for an Employee." << endl;
        cout << "3. Display Employee Details." << endl;
        cout << "4. Update Employee Information." << endl;
        cout << "5. Exit." << endl;
        cin >> task;

        switch(task) {
        case 1: {
            int newID;
            cout << "Enter Employee ID: ";
            cin >> newID;

            bool exists = false;
            for(int i = 0; i < empCount; i++){
                if(emp[i].getEmpId() == newID){
                    exists = true;
                    break;
                }
            }

            if(exists){
                cout << "Employee ID already exists!" << endl;
            } else {
                emp[empCount].newEmp();
                empCount++;
                cout << "Employee added successfully." << endl;
            }
            break;
        }

        case 2: {
            int searchID;
            cout << "Enter Employee ID: ";
            cin >> searchID;
            bool found = false;

            for(int i = 0; i < empCount; i++){
                if(emp[i].getEmpId() == searchID){
                    cout << "Employee's Gross Salary: " << emp[i].calculateGrossSalary() << endl;
                    found = true;
                    break;
                }
            }
            if(!found) cout << "Employee not found!" << endl;
            break;
        }

        case 3: {
            int searchID;
            cout << "Enter Employee ID: ";
            cin >> searchID;
            bool found = false;

            for(int i = 0; i < empCount; i++){
                if(emp[i].getEmpId() == searchID){
                    emp[i].displayEmployeeDetails();
                    found = true;
                    break;
                }
            }
            if(!found) cout << "Employee not found!" << endl;
            break;
        }

        case 4: {
            int searchID;
            cout << "Enter Employee ID: ";
            cin >> searchID;
            bool found = false;
            int index = -1;

            for(int i = 0; i < empCount; i++){
                if(emp[i].getEmpId() == searchID){
                    found = true;
                    index = i;
                    break;
                }
            }

            if(found){
                int a;
                double salary;
                string name;
                do{
                    cout << "\n1. Update Name." << endl;
                    cout << "2. Update Salary." << endl;
                    cout << "3. Exit." << endl;
                    cin >> a;
                    switch(a){
                        case 1:
                            cout << "Enter Name: ";
                            cin >> name;
                            emp[index].setEmpName(name);
                            cout << "Name updated successfully." << endl;
                            break;
                        case 2:
                            cout << "Enter Salary: ";
                            cin >> salary;
                            emp[index].setEmpSalary(salary);
                            cout << "Salary updated successfully." << endl;
                            break;
                        case 3:
                            cout << "Update menu exited." << endl;
                            break;
                        default:
                            cout << "Invalid Entry!" << endl;
                            break;
                    }
                } while(a != 3);
            } else {
                cout << "Employee not found!" << endl;
            }
            break;
        }

        case 5:
            cout << "Thank you." << endl;
            break;

        default:
            cout << "Invalid Entry!" << endl;
            break;
        }

    } while(task != 5);

    return 0;
}
