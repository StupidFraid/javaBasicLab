package Lab_5;

public class Example_6 {
    public static void main(String[] args) {
        System.out.println("Создадим пустой объект");
        Example_6_SuppClass someClass = new Example_6_SuppClass();
        System.out.println("Присвоем ему 2 значения: 15 и 19 c помощью функции");
        someClass.setValue(15, 19);
        System.out.println("Проверим max(с помощью функции getMax()): " + someClass.getMax() + "" +
                " , проверим min(с помощью функции getMin(): " + someClass.getMin());
        System.out.println("Проверим работу функции присвоения значенния с одной переменной setValue(): ");
        someClass.setValue(5);
        System.out.println("Выведем значение с помощью функции printAllValues():");
        someClass.printAllValues();
        System.out.println("Присвоем значение еще ниже ранее присвоенного с помощью ф-ии setValue: ");
        someClass.setValue(3);
        System.out.println("Выведем результат в консоль: ");
        someClass.printAllValues();
    }
}


/*      Напишите программу с классом, в котором есть два закрытых
        целочисленных поля (назовем их max и min). Значение поля max не может
        быть меньше значения поля min. Значения полям присваиваются с помощью
        открытого метода. Метод может вызываться с одним или двумя
        целочисленными аргументами. При вызове метода значения полям
        присваиваются так: сравниваются текущие значения полей и значения
        аргументов, переданных методу. Самое большое из значений присваивается
        полю max, а самое маленькое из значений присваивается полю min.
        Предусмотрите конструктор, который работает по тому же принципу, что и
        метод для присваивания значений полям. В классе также должен быть метод,
        отображающий в консольном окне значения полей объекта.*/
