//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int ticketCost = 13686; //цена билета
        int bonusStep = 20; //за сколько начисляем милю
        int bonus = ticketCost / bonusStep; //количество бонусов (сразу посчитаем)

        // Выводим информацию для клиента
        System.out.println("Добрый день, уважаемый клиент!");
        System.out.println("Вами куплен билет за " + ticketCost + " руб.");
        System.out.println("Вам начислено " + bonus + " б.м.");
        System.out.println("Согласно правилам акции, мили начисляеются за каждые " + bonusStep + " руб.");
        System.out.println("Не прошли по акции " + (ticketCost - bonus * bonusStep) + " руб.")
    }
}