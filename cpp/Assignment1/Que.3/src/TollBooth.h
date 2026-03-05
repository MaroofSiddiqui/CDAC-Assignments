/*
 * TollBooth.h
 *
 *  Created on: Mar 1, 2026
 *      Author: Maroof
 */


#ifndef TOLLBOOTH_H_
#define TOLLBOOTH_H_


class TollBooth{
	int totalVehicles;
	double totalRevenue;

public:

	TollBooth();
	void reset();
	void vehiclePayingToll(int vehicleType, double tollAmount);
	double getTotalRevenue();
	int getTotalVehicles();
};


#endif /* TOLLBOOTH_H_ */
