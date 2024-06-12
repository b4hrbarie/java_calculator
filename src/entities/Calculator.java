package scr.entities;

public class Calculator {

    private double number;
    private double number2;
    public double result = 0;

    public void setNumber1(double number) {
        this.number = number;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void useRes() {
        this.number = this.result;
    }

    public double Sum() {
        return this.result = this.number + this.number2;
    }

    public double Sub() {
        return this.result = this.number - this.number2;
    }

    public double Mult() {
        return this.result = this.number * this.number2;
    }

    public double Div() {
        return this.result = this.number / this.number2;
    }
}