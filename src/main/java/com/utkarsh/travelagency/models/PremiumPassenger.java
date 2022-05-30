package com.utkarsh.travelagency.models;

import com.utkarsh.travelagency.Exceptions.FullCapacityException;
import com.utkarsh.travelagency.Exceptions.InsufficientBalanceException;

public class PremiumPassenger extends Passenger {

    @Override
    public void signUp(Destination destination, Activity activity) throws FullCapacityException, InsufficientBalanceException {
        if(activity.getPassengersEnrolled() < activity.getCapacity()) {
            activity.setPassengersEnrolled(activity.getPassengersEnrolled()+1);
        } else if(activity.getPassengersEnrolled() >= activity.getCapacity()) {
            throw new FullCapacityException();
        }
    }
}
