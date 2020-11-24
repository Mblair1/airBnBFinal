package com.citadel.edu.model.interfaces;

import com.citadel.edu.model.Rental;

public interface Transaction {
	public void process(Rental rental);
	public void cancel(Rental rental);
	public void addCharge(Rental rental, int charge);
}
