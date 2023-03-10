package lesson01;

public class Numbers {
    private double x;
    private double y;

    public Numbers(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getSum() {
        return this.getX() + this.getY();
    }

    public double getDiff() {
        return this.getX() - this.getY();
    }

    public double getMulti() {
        return this.getX() * this.getY();
    }

    public double getDiv() {
        return this.getX() / this.getY();
    }

    public String errorCheck(char operation) {
        if(this.y == 0 && operation == '/') {
            return "Division on null is impossible!";
        }
        if(operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            return "Invalid operation!";
        }
        return "";
    }

    public double getResult(char operation) {
        double result;
        switch (operation) {
            case '+':
                result = this.getSum();
                break;
            case '-':
                result = this.getDiff();
                break;
            case '*':
                result = this.getMulti();
                break;
            case '/':
                result = this.getDiv();
                break;
            default:
                result = 0;
        }
        return result;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
