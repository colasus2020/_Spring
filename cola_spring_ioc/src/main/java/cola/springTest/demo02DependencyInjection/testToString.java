package cola.springTest.demo02DependencyInjection;

public class testToString {
    private String name;
    private Integer age;

    public testToString(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /*@Override
    public String toString() {
        return "testToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
*/
    public static void main(String[] args) {
        testToString test = new testToString("cola", 23);
        System.out.println(test);
    }
}
