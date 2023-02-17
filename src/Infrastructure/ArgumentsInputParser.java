package Infrastructure;

import domain.CalculatorArguments;

public class ArgumentsInputParser {
    public CalculatorArguments parseArgs(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Please provide a file name and an operation");
        }

        String fileName = args[0];
        String operation = args[1];
        boolean isDebug = args.length == 3 && args[2].equals("-log");
        String operationString = getOperationToString(operation);

        return new CalculatorArguments(fileName, operation, operationString, isDebug);
    }

    private String getOperationToString(String operation) {
        return switch (operation) {
            case "+" -> "addition";
            case "-" -> "soustraction";
            case "*" -> "multiplication";
            default -> throw new IllegalArgumentException("Please provide a valid operation");
        };
    }
}
