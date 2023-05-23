import java.util.ArrayList; // Импортируйте ArrayList

public class ExpensesManager {
    ArrayList<Double> expenses; // Замените массив списком

    ExpensesManager() {
        expenses = new ArrayList<>(); // Создайте список в конструкторе
    }

    // Номер дня больше не нужен
    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(expense); // Эту строку нужно убрать
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double listExpenses : expenses) { // Используйте сокращённую форму цикла
            if (listExpenses > maxExpense) {
                maxExpense = listExpenses;
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expenses.clear();
        System.out.println("Список трат пуст.");
    }

    void removeExpense(double expense) {
        if (expenses.contains(expense)) {
            int index = 0;
            for (int i=0; i<expenses.size(); i++) {
                if (expense == expenses.get(i)){
                    index = i;
                    break;
                }
            }
            expenses.remove(index);
            System.out.println("Трата удалена!");
        } else {
            System.out.println("Такой траты нет.");
        }
    }
}