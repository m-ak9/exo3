package domain;

import java.util.ArrayList;
import java.util.List;

public class Calcul {

    private int result;
    private List<OperationLine> operationLines;
    private final int firstNumber;

    List<Integer> numbersToOperate;

    private final String operation;


    public Calcul(String operation, List<Integer> numbers) {
        this.operation = operation;
        this.firstNumber = numbers.get(0);
        this.numbersToOperate = numbers.subList(1, numbers.size());
        this.operationLines = new ArrayList<>();
        this.result = calculate();
    }

    private int calculate() {
        if (this.operation.equals("+")) {
            return sum(this.numbersToOperate);
        } else if (this.operation.equals("-")) {
            return subtract(this.numbersToOperate);
        } else {
            return multiply(this.numbersToOperate);
        }
    }


    private int sum(List<Integer> numbers) {
        int sum = this.firstNumber;

        for (int number : numbersToOperate) {
            sum += number;
            this.operationLines.add(new OperationLine(operation, number, sum));
        }

        return sum;
    }

    private int multiply(List<Integer> numbers) {
        int multiplication = this.firstNumber;

        for (int number : numbersToOperate) {
            multiplication *= number;
            this.operationLines.add(new OperationLine(operation, number, multiplication));
        }

        return multiplication;
    }

    private int subtract(List<Integer> numbers) {
        int soustraction = this.firstNumber;

        for (int number : numbersToOperate) {
            soustraction -= number;
            this.operationLines.add(new OperationLine(operation, number, soustraction));
        }

        return soustraction;
    }

    public int getResult() {
        return result;
    }

    public List<OperationLine> getOperationLines() {
        return operationLines;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public String getOperation() {
        return operation;
    }
}
