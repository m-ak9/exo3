package Infrastructure;

import domain.Calcul;

public class CLIOutput {


    public void display(Calcul calcul, String operationString ) {
        displayFirstNumber(calcul);
        displayCalculatorLine(calcul);
        displayResult(calcul, operationString);
    }

    public void displayCalculatorLine(Calcul calcul) {
        calcul.getOperationLines().forEach(operationLine -> {
            System.out.println(operationLine.getOperation() + operationLine.getNumber() + " (=" + operationLine.getResult() + ")");
        });
    }

    public void displayFirstNumber(Calcul calcul) {
        System.out.println(calcul.getFirstNumber());
    }

    public void displayResult(Calcul calcul, String operationString) {
        System.out.println("-------");
        System.out.println("total = " + calcul.getResult() + " (" + operationString + ")");
    }
}
