package domain;

public class CalculatorArguments {

    private final String fileName;
    private final String Operation;
    private final String OperationString;

    private final boolean isDebug;

    public CalculatorArguments(String fileName, String operation, String operationString, boolean isDebug) {
        this.fileName = fileName;
        Operation = operation;
        OperationString = operationString;
        this.isDebug = isDebug;
    }

    public String getFileName() {
        return fileName;
    }

    public String getOperation() {
        return Operation;
    }

    public String getOperationString() {
        return OperationString;
    }

    public boolean isDebug() {
        return isDebug;
    }
}
