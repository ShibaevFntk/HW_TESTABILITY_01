public class BonusMilesService {//Создал класс

    public int calculate(int ticketCost) {//Определил метод, задал параметр

        //Переношу с main
        int bonusStep = 20; //для хранения количества рублей для одной бонусной мили

        return ticketCost / bonusStep;

    }
}
