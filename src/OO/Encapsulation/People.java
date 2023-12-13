package OO.Encapsulation;

public class People {
    private int age;
    private String name;
    private String surname;

    public People(String name, String surname, int age){
        setAge(age);
        setName(name);
        setSurname(surname);
    }
    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        newAge = Math.abs(newAge);
        if(newAge >= 0 && newAge < 120){
            this.age = newAge;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String setFullname(){
        return getName() + " " + getSurname();
    }
    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
