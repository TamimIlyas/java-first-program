import java.util.Arrays;
import java.util.Map;
import com.h2.BestLoanRates;
import com.h2.MortgageCalculator;
import com.h2.SavingsCalculator;

public class Finance {

    public static final String BEST_LOAN_RATES = "bestLoanRates";
    public static final String SAVINGS_CALCULATOR = "savingsCalculator";
    public static final String MORTGAGE_CALCULATOR = "mortgageCalculator";

    public static final Map<String, String> commandsToUsage = Map.of(
            BEST_LOAN_RATES, "usage: bestLoanRates",
            SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
            MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");


    private static boolean validateCommandArguments(String[] args) {
        switch (args[0]) {
            case BEST_LOAN_RATES:
                return args.length == 1;
            case SAVINGS_CALCULATOR:
                return args.length == 3;
            case MORTGAGE_CALCULATOR:
                return args.length == 4;
        }
        return false;

    }
    private static void executeCommand(String command, String[] argumnets){
        switch (command) {
            case BEST_LOAN_RATES:
                System.out.println("Finding best loan rates ...");
                BestLoanRates.main(argumnets);
                return;

            case SAVINGS_CALCULATOR:
                System.out.println("Finding your net savings ...");
                SavingsCalculator.main(argumnets);
                return;

            case MORTGAGE_CALCULATOR:
                System.out.println("Finding your monthly payment ...");
                MortgageCalculator.main(argumnets);

        }
    }

    public static void main(String[] args){
        String command = args[0];
        if (!commandsToUsage.containsKey(command)){
            System.out.println(command + ": command not found");
            return;
        }
        boolean isValidCommand = validateCommandArguments(args);
        if (isValidCommand){
            executeCommand(command, Arrays.copyOfRange(args, 1, args.length));

        }else{
            System.out.println(command + ": command not valid");
            return;
        }
    }
}

