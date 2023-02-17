package Infrastructure;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {
/*
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss:ffffff");

    boolean isDebug = false;

    public void logStart() {
        if (isDebug) {
            LocalTime time = LocalTime.now();
            String formattedTime = time.format(formatter);
            System.out.println("[" + formattedTime + "]" + "[log] " + "started");
        }
    }

    public void logOperation(String operationString) {
        if (isDebug) {
            LocalTime time = LocalTime.now();
            String formattedTime = time.format(formatter);
            System.out.println("[" + formattedTime + "]" + "[log] " + operationString);
        }
    }

    public void logParsedValue(String value) {
        if (isDebug) {
            LocalTime time = LocalTime.now();
            String formattedTime = time.format(formatter);
            System.out.println("[" + formattedTime + "]" + "[log] " + "parsed value: " + value);
        }

    }

    public void logCalculation(String operation, int number, int lineIndex) {
        if (isDebug) {

            LocalTime time = LocalTime.now();
            String formattedTime = time.format(formatter);

            if (operation.equals("+")) {
                operation = "accumulation";
            } else if (operation.equals("-")) {
                operation = "subtraction";
            } else {
                operation = "multiplication";
            }

            System.out.println("[" + formattedTime + "]" + "[log] " + "line " + lineIndex + ": " + operation + number);
        }
    }

    public void logEndOfProgram() {
        if (isDebug) {
            LocalTime time = LocalTime.now();
            String formattedTime = time.format(formatter);
            System.out.println("[" + formattedTime + "]" + "[log] " + "end of program");
        }
    }
*/
}
