import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        view.showView(ViewType.WonderedNumber);
        int userNumber = inputIntValueWithScannerAndRange(scanner);

        while (!service.isWonderedValue(model, userNumber)) {
            userNumber = inputIntValueWithScannerAndRange(scanner);
        }

        view.showView(ViewType.CongratsAndStatistics);
    }

    private int inputIntValueWithScannerAndRange(Scanner sc) {
        int res;
        while (true) {
            String string;
            while (true) {
                view.showView(ViewType.InputYourNumber);
                if (sc.hasNextLine()) {
                    string = sc.nextLine();
                    if (StringUtils.isStringDigit(string)) break;
                    view.showView(ViewType.WrongNumber);
                }
            }

            string = StringUtils.removeSpaces(string);
            res = Integer.parseInt(string);

            if (res <= model.getMinNumber() || res >= model.getMaxNumber()) {
                view.showView(res);
                view.showView(ViewType.OutOfRange);
                continue;
            }
            break;
        }
        view.showView(res);
        return res;
    }
}
