public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        //System.out.println(miles);
        System.out.println("Добрый день, уважаемый клиент!");
        System.out.println("Вами куплен билет за " + price + " руб.");
        System.out.println("Вам начислено " + miles + " б.м."); // вывожу на экран
        //System.out.println("Согласно правилам акции, мили начисляются за каждые " + bonusStep + " руб.");
        //System.out.println("Не прошли по акции " + (price - bonus * bonusStep) + " руб.");

    }
}
