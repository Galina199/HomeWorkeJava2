package HomeWork3.task2;

public class HomeWork3 {
    public  static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Наполняем справочник");
        phonebook.add("Иваненко", "223344");
        phonebook.add("Иваненко", "22334411");
        phonebook.add("Соловьёв", "22334499");
        phonebook.add("Петренко", "22334488");
        phonebook.add("Иваненко", "22334422");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Иваненко");
        System.out.println(phonebook.get("Иваненко"));
        System.out.println("Соловьёв");
        System.out.println(phonebook.get("Соловьёв"));
        System.out.println("Петренко");
        System.out.println(phonebook.get("Петренко"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Попов");
        System.out.println(phonebook.get("Попов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Иваненко", "223344");
        System.out.println("Иваненко");
        System.out.println(phonebook.get("Иваненко"));
    }
}
