package application;

import Infrastructure.CLIOutput;
import Infrastructure.ArgumentsInputParser;
import Infrastructure.FileReader;
import Infrastructure.Logger;
import domain.CalculatorArguments;
import domain.Calcul;

import java.util.List;

public class CalculatorApp {

    private final ArgumentsInputParser argumentParser;
    private final FileReader fileReader;
    private final CLIOutput cliOutput;
    private final Logger logger;

    public CalculatorApp(ArgumentsInputParser argumentParser, FileReader fileReader, CLIOutput cliOutput, Logger logger) {
        this.argumentParser = argumentParser;
        this.fileReader = fileReader;
        this.cliOutput = cliOutput;
        this.logger = logger;
    }

    public void start(String[] args) {

        //Get input
        CalculatorArguments arguments = argumentParser.parseArgs(args);
        List<Integer> numbers = fileReader.readNumbersInFile(arguments.getFileName());

        //Business logic
        Calcul calcul = new Calcul(arguments.getOperation(), numbers);

        cliOutput.display(calcul, arguments.getOperationString());
    }
}
