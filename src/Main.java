//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.printf("Go-мобайл приветствует Вас!   ");

        int i = 155;
        //объявляем значение переменной - сумма начального счета клиента
        int sumPopolnenie = 1200;
        //объявляем значение переменной - сумма пополнения
        int bonus;
        //бонус
        int sumItog;
        //итоговая сумма на счету клиента после начисления бонусов и внесения пополнения
        if (sumPopolnenie <= 1000) {
            bonus = 0;
            sumItog = i + sumPopolnenie + bonus;
            System.out.println("У Вас на счету " + sumItog + " рублей.  За пополнение Вам было начислено " + bonus + " рублей");
        } else {
            bonus = sumPopolnenie / 100;
            sumItog = i + sumPopolnenie + bonus;
            System.out.println("У Вас на счету " + sumItog + " рублей.  За пополнение Вам было начислено " + bonus + " рублей");
        }

    }


}
