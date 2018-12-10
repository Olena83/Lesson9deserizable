package homework9part1;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

//  4. видалення поля name в десеріалізованому об"єкті
    private String name;
//  5.зміна типу з String на Character
    public String surname;

//  3. видалення /6.додавання поля transient з поля age
private int age;

//1.додавання нового поля для десеріалізації
    public int weight=56;

//    public Person(String name, String surname, int age) {
//        this.surname = surname;
//        this.age = age;
//    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return "Person: " +", name: "+ name+
               ", surname: "+surname +
                ", age: " + age ;
    }
}


