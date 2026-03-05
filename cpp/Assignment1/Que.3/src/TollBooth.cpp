/*
 * TollBooth.cpp
 *
 *  Created on: Mar 1, 2026
 *      Author: Maroof
 */


#include <iostream>
using namespace std;
#include "TollBooth.h"

TollBooth::TollBooth(){
	totalRevenue = 0;
	totalVehicles = 0;
}
void TollBooth::reset(){
	totalVehicles = 0;
	totalRevenue = 0;
}
void TollBooth::vehiclePayingToll(int vehicleType, double tollAmount){
	switch (vehicleType){
	case 1:
		totalRevenue += 180;
		cout << "Toll Amount :- "<<tollAmount<<endl;
		totalVehicles += 1;
		break;
	case 2:
		totalRevenue += 300;
		cout << "Toll Amount :- "<<tollAmount<<endl;
		totalVehicles += 1;
		break;
	case 3:
		totalRevenue += 350;
		cout << "Toll Amount :- "<<tollAmount<<endl;
		totalVehicles += 1;
		break;
	default:
		cout <<"Invalid type!"<<endl;
	}

}

double TollBooth::getTotalRevenue(){
	cout<<"Total revenue collected is :- "<<totalRevenue<<endl;
	return totalRevenue;
}

int TollBooth::getTotalVehicles(){
	cout<<"Total vehicles crossed :- "<< totalVehicles<<endl;
	return totalVehicles;
}
