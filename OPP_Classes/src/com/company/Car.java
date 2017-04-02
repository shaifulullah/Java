package com.company;

public class Car {
    private int _door;
    private int __wheels;
    private String _model;
    private String _engine;
    private String _colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("abcmodel") || validModel.equals("porche")) {
            this._model = validModel;
        } else {
            this._model = "unknown";
        }

    }

    public String getModel() {
        return this._model;
    }
}
