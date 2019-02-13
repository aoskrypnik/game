public class Service {

    public boolean isWonderedValue(Model model, int value) {
        if (value == model.getWonderedNumber()) {
            addToStatistics(model, value);
            return true;
        } else if (value > model.getWonderedNumber())
            model.setMaxNumber(value);
        else
            model.setMinNumber(value);
        addToStatistics(model, value);
        return false;
    }

    public void addToStatistics(Model model, int value) {
        model.getStatistics().add(View.ATTEMPT_TO_GUESS_NUMBER + (model.getStatistics().size() + 1) +
                View.VALUE_OF_ATTEMPT + value);
    }
}
