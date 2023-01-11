package Lab_7.Example_2;

public class Example_2 {
    public static void main(String[] args) {
     SuperClassTest superClassObject = new SuperClassTest("Передал в конструктор суперкласса");
        System.out.println(superClassObject.toString());
    SubClassTest subClassObject = new SubClassTest("Передал в конструктор сабкласса", 5);
        System.out.println(subClassObject.toString());
        System.out.println("Вызовем переопределенный метод сабкласса для присвоения с строковым параметром:");
        subClassObject.setValue("передали новую строку");
        System.out.println(subClassObject.toString());
        System.out.println("Вызовем переопределенный метод сабкласса для присвоения с целочисленным параметром:");
        subClassObject.setValue(15);
        System.out.println(subClassObject.toString());
        System.out.println("Вызовем переопределенный метод сабкласса с обоими параметрами:");
        subClassObject.setValue("передали саб классу оба параметра",15);
        System.out.println(subClassObject.toString());
    }
}

//        Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//        базовом классе должен быть метод для присваивания значения полю: без параметров и с
//        одним текстовым параметром. Объект суперкласса создается передачей одного текстового
//        аргумента конструктору. Доступное только для чтения свойство результатом возвращает
//        длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
//        дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
//        для присваивания значений полям (используется переопределение и перегрузка метода из
//        суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//        текстовым и целочисленным параметром. У конструктора подкласса два параметра
//        (целочисленный и текстовый).