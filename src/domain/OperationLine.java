package domain;

public class OperationLine {
private final String operation;
    private final int number;
    private final int result;

    public OperationLine(String operation, int number, int result) {
        this.operation = operation;
        this.number = number;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public int getNumber() {
        return number;
    }

    public int getResult() {
        return result;
    }

}
