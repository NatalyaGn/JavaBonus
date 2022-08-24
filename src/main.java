public class main {
    public static void main(String[] args) {
        int balance = 800;// начальный счёт
        int pay = 2500;// сумма пополнения
        int bonys;
        if (pay > 1000) {
            bonys = pay / 1000;
        } else {
                bonys = 0;
            }
            int finalBalans = balance + pay + bonys; //итоговый счёт
            System.out.println("итоговый счёт " + finalBalans);
            System.out.println("сумма бонусов " + bonys);
        }
    }
