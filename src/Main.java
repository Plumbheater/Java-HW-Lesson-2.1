public class Main {
    public static void main(String[] args) {

        int amount = 10; // цена за билет
        int pass = 4; // количество купленных билетов
        int total = amount * pass; // сумма билетов

        int miles; // условия получения бонусных милей
        if (total > 19) {
            miles = total / 20;
        } else {
                miles = 0;
            }
            System.out.println("Бонусные мили: " + miles);
    }
}