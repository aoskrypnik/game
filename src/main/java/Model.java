import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    private int maxNumber;
    private int minNumber;
    private int wonderedNumber;
    private List<String> statistics;

    public Model() {
        statistics = new ArrayList<String>();
    }

    public int getRandomNumber() {
        Random random = new Random();
        return ((minNumber + 1) + random.nextInt(maxNumber - minNumber - 1));
    }

    public int getRandomNumber(int yourMinInput, int youMaxInput) {
        Random random = new Random();
        return ((yourMinInput + 1) + random.nextInt(youMaxInput - yourMinInput - 1));
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public void setWonderedNumber(int wonderedNumber) { this.wonderedNumber = wonderedNumber; }

    public int getWonderedNumber() {
        return wonderedNumber;
    }

    public List<String> getStatistics() {
        return statistics;
    }

    public int getNumberOfAttempts() {
        return statistics.size();
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }
}
