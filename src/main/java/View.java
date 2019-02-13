import java.util.List;

public class View {
    private Model model;
    public static final String INPUT_YOUR_NUMBER = "Please, enter your number: ";
    public static final String WELL_YOU_INPUT = "Well, you input ";
    public static final String WRONG_INPUT = "Incorrect input data.";
    public static final String CURRENT_RANGE = "The range of the number is ";
    public static final String OUT_OF_RANGE = "Current number is out of range. ";
    public static final String ATTEMPT_TO_GUESS_NUMBER = "Attempt #";
    public static final String VALUE_OF_ATTEMPT = ". The value of number is ";
    public static final String CONGRATS = "Congratulations!!! You have guessed!!!";
    public static final String NUMBER_OF_ATTEMPTS = "The total number of attempts is ";
    public static final String WONDERED_NUMBER = "The number was wondered!";
    public static final String NULL_STRING = "";

    public View(Model model) {
        this.model = model;
    }

    public void showView(ViewType viewType) {
        switch (viewType) {
            case WrongNumber:
                printMessage(WRONG_INPUT);
                break;
            case InputYourNumber:
                printMessage(View.CURRENT_RANGE + Constants.LEFT_SCOPE + model.getMinNumber() + Constants.SPACE
                        + model.getMaxNumber() + Constants.RIGHT_SCOPE);
                printMessage(INPUT_YOUR_NUMBER);
                break;
            case WonderedNumber:
                printMessage(WONDERED_NUMBER + Constants.NEW_LINE);
                break;
            case CongratsAndStatistics:
                printMessage(Constants.NEW_LINE + View.CONGRATS + Constants.NEW_LINE);
                printMessage(View.NUMBER_OF_ATTEMPTS + model.getNumberOfAttempts());
                showStatistics(model.getStatistics());
                break;
            case OutOfRange:
                printMessage(View.OUT_OF_RANGE);
                break;
        }
    }

    public void showView(int inputNumber) {
        printMessage(View.WELL_YOU_INPUT + inputNumber);
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private void showStatistics(List<String> list) {
        for (String string : list)
            printMessage(string);
    }
}
