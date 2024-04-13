public class Student extends Person{
    private Integer year;

    private Float fee;

    private String career;

    public Student() {
    }

    public Student(Integer dni, String name, String surname, String email, String address, Integer year, Float fee, String career) {
        super(dni, name, surname, email, address);
        this.year = year;
        this.fee = fee;
        this.career = career;
    }

}
