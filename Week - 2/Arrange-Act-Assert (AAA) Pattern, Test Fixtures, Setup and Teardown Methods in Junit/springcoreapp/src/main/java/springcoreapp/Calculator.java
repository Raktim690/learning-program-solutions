package springcoreapp;
public class Calculator {
    private int result;

    public void add(int number) {
        this.result += number;
    }

    public void clear() {
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }
}