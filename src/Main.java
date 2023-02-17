import Infrastructure.ArgumentsInputParser;
import Infrastructure.CLIOutput;
import Infrastructure.FileReader;
import Infrastructure.Logger;
import application.CalculatorApp;

public class Main {
    public static void main(String[] args) {
        //Instanciate infrastructure services
        ArgumentsInputParser argumentParser = new ArgumentsInputParser();
        FileReader fileReader = new FileReader();
        CLIOutput cliOutput = new CLIOutput();
        Logger logger = new Logger();

        //Start Application
        CalculatorApp calculatorApp = new CalculatorApp(argumentParser, fileReader, cliOutput, logger);
        calculatorApp.start(args);
    }

}
