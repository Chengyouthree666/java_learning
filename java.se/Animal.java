public class Animal {
    int animalAge;
    String animalName;

//    class ZooAnimal {
//        enum names { 老虎, 狮子, 河马 }
//    }

    public void setName(String name) {
        animalName = name;
    }
    public String getAnimalName() {
        return animalName;
    }

    public void setAge(int age) {
        animalAge = age;
    }
    public int getAge() {
//        System.out.println(animalAge);
        return animalAge;
    }
}
