package equalsAndHashcode;

public class Person {
    private String name;
    private int age;
    private String iin;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String iin) {
        this.name = name;
        this.age = age;
        this.iin = iin;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false; //Если переданный объект не типа Person
        Person person = (Person) obj;

        boolean name = (this.name == null && person.name == null) || (this.name != null && this.name.equals(person.name));
        boolean iin = (this.iin == null && person.iin == null) || (this.iin != null && this.iin.equals(person.iin));
        return this.age == person.age && name && iin;


    }

    @Override
    public int hashCode() {
        int result = 17;
        if(name != null) {
            result = 31 * result + name.hashCode();
        }
        if(iin != null) {
            result = 31 * result + iin.hashCode();
        }
        result += age;
        return result;
    }



}
