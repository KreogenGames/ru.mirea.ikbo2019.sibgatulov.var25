package Practice_2;

import java.time.LocalDate;

public class Human {
    protected final Integer age;
    protected final String firstName;
    protected final String lastName;
    protected final LocalDate birthDate;
    protected final Integer weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public char getSecSym() {
        return firstName.charAt(1);
    }

    public Integer getWeight() {
        return weight;
    }
/*
    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, birthDate, weight);
    }
    */
    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }
}
