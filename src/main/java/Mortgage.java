public class Mortgage {
    public static void main(String[] args) {
        int cost = 2500000;
        double firstPayment = 20.0;
        double firstContibution = cost / 100 * firstPayment;

        System.out.println("Сумма ипотеки " + cost);
        System.out.println("Первоначальный платёж " + firstPayment + " %");
        System.out.println("Первоначальный взнос " + firstContibution + " рублей");
    }
}
