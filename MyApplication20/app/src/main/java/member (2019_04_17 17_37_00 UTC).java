public class member {
    private String name;
    private Integer age;
    private Long phone;

    public member(String name, Integer age, Long phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getPhone() {
        return phone;
    }
}
