package com.example.SpringDemo.DTO;


import javax.validation.constraints.NotBlank;

public class CarDTO {
    @NotBlank
    private String id;

    @NotBlank
    private String modelName;

    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    }

