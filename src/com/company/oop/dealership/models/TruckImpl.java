package com.company.oop.dealership.models;

import com.company.oop.dealership.models.contracts.Truck;
import com.company.oop.dealership.models.enums.VehicleType;
import com.company.oop.dealership.utils.ValidationHelpers;

public class TruckImpl extends VehicleBase implements Truck {
    public static final int WEIGHT_CAP_MIN = 1;
    public static final int WEIGHT_CAP_MAX = 100;
    private static final String WEIGHT_CAP_ERROR_MESSAGE = String.format("Weight capacity must be between %d and %d!",
            WEIGHT_CAP_MIN, WEIGHT_CAP_MAX);

    private int weightCapacity;

    public TruckImpl(String make, String model, double price, int weightCapacity) {
        super(make, model, price, 8);
        setWeightCapacity(weightCapacity);
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    private void setWeightCapacity(int weightCapacity) {
        ValidationHelpers.validateIntRange(weightCapacity, WEIGHT_CAP_MIN, WEIGHT_CAP_MAX, WEIGHT_CAP_ERROR_MESSAGE);
        this.weightCapacity = weightCapacity;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }

    @Override
    protected String printAdditionalInformation() {
        return String.format("Weight capacity: %dt%n", weightCapacity);
    }
}
