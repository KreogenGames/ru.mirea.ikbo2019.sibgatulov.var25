package SecondPractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Test {
    public static void main(String[] args){
        List<Human> HumanList = new ArrayList<>();

        Human first = new Human(118, "Max", "Illarionovich",  LocalDate.of(2002, 11, 30), 59);
        HumanList.add(first);

        Human sec = new Human(230, "Actor", "Menetil", LocalDate.of(1998, 10, 18), 78);
        HumanList.add(sec);

        Human third = new Human(10, "Abelix", "Smartest", LocalDate.of(990, 6, 25), 80);
        HumanList.add(third);

        System.out.println("Фильтрация по весу больше 60");
        Stream<Human> stream = HumanList.stream();
        stream.filter(str -> str.getWeight() > 60).forEach(System.out::println);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Сортировка по возрасту");
        Stream<Human> stream1 = HumanList.stream();
        stream1.sorted(Comparator.comparingInt(Human::getAge)).forEach(System.out::println);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Сортировка по 2 букве имени в обратном порядке");
        Stream<Human> stream2 = HumanList.stream();
        stream2.sorted(Comparator.comparing(Human::getSecSym).reversed()).forEach(System.out::println);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Произведение всех возрастов");
        Stream<Human> stream3 = HumanList.stream();
        int result = /*IntStream.of*/parseInt(String.valueOf(stream3.mapToInt(e -> e.getAge()).reduce(1, (a, b) -> a * b)));
        System.out.println(result);
        /* Попытка объединить 2 сортировки в 1
        Stream<Human> stream2 = HumanList.stream();
        stream2.sorted((o1, o2) -> !o1.getSecSym().equals(o2.getSecSym()) ? o1.getSecSym().compareTo(o2.getSecSym())
                : o1.getAge().compareTo(o2.getAge())).collect(Collectors.toList()).forEach(System.out::println);*/
    }
}
