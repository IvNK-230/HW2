public class Main {
    public static void main(String[] args) {

        int price = 16_676;      // Стоимость билета
        int bonus = 20;          // Цена бонусной мили

        int miles = (price / bonus);       // Рассчитываете количество бонусных миль, используя
        System.out.println(miles);     // Вывод колличества миль
    }
}