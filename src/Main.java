//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.print("Go-мобайл приветствует Вас!   ");

        int initialAccount = 155;
        //объявляем значение переменной - сумма начального счета клиента
        int sumAdd = 1200;
        //объявляем значение переменной - сумма пополнения
        int bonus;
        //бонус
        int sumTotal;
        //итоговая сумма на счету клиента после начисления бонусов и внесения пополнения
        if (sumAdd <= 1000) {
            bonus = 0;
            sumTotal = initialAccount + sumAdd + bonus;
            System.out.println("У Вас на счету " + sumTotal + " рублей.  За пополнение Вам было начислено " + bonus + " рублей");
        } else {
            bonus = sumAdd / 100;
            sumTotal = initialAccount + sumAdd + bonus;
            System.out.println("У Вас на счету " + sumTotal + " рублей.  За пополнение Вам было начислено " + bonus + " рублей");
        }

    }


}
