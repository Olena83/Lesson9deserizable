package des;
import homework9part1.Person;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//Десеріалізація об"єкта Person

public class deserizable {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("person.out");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Person ps = (Person) oin.readObject();
        System.out.println(ps.getAge());
    }
}


