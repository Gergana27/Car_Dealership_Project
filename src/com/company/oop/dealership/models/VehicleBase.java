package com.company.oop.dealership.models;

import com.company.oop.dealership.models.contracts.Comment;
import com.company.oop.dealership.models.contracts.Vehicle;
import com.company.oop.dealership.utils.FormattingHelpers;
import com.company.oop.dealership.utils.ValidationHelpers;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public abstract class VehicleBase implements Vehicle {
    public static final int MAKE_MIN_LENGTH = 2;
    public static final int MAKE_MAX_LENGTH = 15;
    public static final int MODEL_MIN_LENGTH = 1;
    public static final int MODEL_MAX_LENGTH = 15;
    public static final double PRICE_MIN_VALUE = 0.0;
    public static final double PRICE_MAX_VALUE = 1000000.0;
    public static final String MAKE_ERROR_MESSAGE = format("Make should be between %s and %s symbols.", MAKE_MIN_LENGTH, MAKE_MAX_LENGTH);
    public static final String MODEL_ERROR_MESSAGE = format("Model should be between %s and %s symbols.", MODEL_MIN_LENGTH, MODEL_MAX_LENGTH);
    public static final String PRICE_ERROR_MESSAGE = format("Price should be between %.1f and %.1f.", PRICE_MIN_VALUE, PRICE_MAX_VALUE);
    public static final String COMMENTS_HEADER = "--COMMENTS--";
    public static final String NO_COMMENTS_HEADER = "--NO COMMENTS--";

    private String make;
    private String model;
    private double price;
    private int wheels;
    private List<Comment> comments;

    public VehicleBase(String make, String model, double price, int wheels) {
        setMake(make);
        setModel(model);
        setPrice(price);
        setWheels(wheels);
        this.comments = new ArrayList<>();
    }

    private void setMake(String make) {
        ValidationHelpers.validateIntRange(make.length(), MAKE_MIN_LENGTH, MAKE_MAX_LENGTH, MAKE_ERROR_MESSAGE);
        this.make = make;
    }

    private void setModel(String model) {
        ValidationHelpers.validateIntRange(model.length(), MODEL_MIN_LENGTH, MODEL_MAX_LENGTH, MODEL_ERROR_MESSAGE);
        this.model = model;
    }

    private void setPrice(double price) {
        ValidationHelpers.validateDecimalRange(price, PRICE_MIN_VALUE, PRICE_MAX_VALUE, PRICE_ERROR_MESSAGE);
        this.price = price;
    }

    private void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public List<Comment> getComments() {
        return new ArrayList<>(comments);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("Make: %s%n", make));
        builder.append(String.format("Model: %s%n", model));
        builder.append(String.format("Wheels: %d%n", wheels));
        builder.append(String.format("Price: $%s%n", FormattingHelpers.removeTrailingZerosFromDouble(price)));
        builder.append(printAdditionalInformation());
        builder.append(printComments());

        return builder.toString();
    }
    protected abstract String printAdditionalInformation();

    private String printComments() {
        StringBuilder builder = new StringBuilder();
        if (comments.size() <= 0) {
            builder.append(NO_COMMENTS_HEADER);
        }else {
            builder.append(COMMENTS_HEADER).append(System.lineSeparator());
            for (Comment comment : comments) {
                builder.append(comment.toString());
            }
            builder.append(COMMENTS_HEADER);
        }
        return builder.toString();
    }
}

