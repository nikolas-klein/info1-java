package beispiele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBeispiele {

  public void PersonStream(){
    Person person1 = new Person("Peter", 20,new HashSet<>(Arrays.asList("fußball", "lesen", "tennis")));
    Person person2 = new Person("Lisa", 19,new HashSet<>(Arrays.asList("fußball", "reiten", "programmieren")));
    Person person3 = new Person("Hannes", 19,new HashSet<>(Arrays.asList("fußball", "schreiben", "tennis")));
    Person person4 = new Person("Julia", 23,new HashSet<>(Arrays.asList("lesen", "kochen", "reiten")));
    Person person5 = new Person("Lisa", 18,new HashSet<>(Arrays.asList("reisen", "schreiben", "tennis")));

    ArrayList<Person> personenUeberNeunzehn = Stream.of(person1,person2,person3,person4,person5)
            .filter(person -> person.getAlter() >= 19)
            .collect(Collectors.toCollection(() -> new ArrayList<Person>()));


    ArrayList<Person> personenUeberNeunzehn2 = new ArrayList<>();
    for (Person person : Arrays.<Person>asList(person1, person2, person3,
        person4, person5)) {
      if (person.getAlter() >= 19) {
        personenUeberNeunzehn2.add(person);
      }
    }
  }

  private  void streamInteger() {
    int[] number = new int[100];
    for (int i = 0; i < number.length; i++) {
      number[i] = new Random().nextInt(100);
    }

    for (int num : number) {
      if (num <= 50) {
        int x = num * 2;
        System.out.println(x);
      }
    }
    Arrays.stream(number).filter(num -> num <= 50).map(num -> num*2).forEach(
            x -> System.out.println(x));

  }
}
