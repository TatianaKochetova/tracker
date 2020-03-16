package Loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        double year = 0;
        while (amount > 0) {
            amount = (int) (amount + (amount * (percent / 100)) - salary);
            year++;
        }
        return (int) year;
    }
}
