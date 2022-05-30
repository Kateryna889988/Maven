package andersen.lesson3;

public class Employee {
    private String fullName;
    private String jobPosition;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fullName, String jobPosition, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public String getName() {
        return fullName;
    }

    public String getJob() {
        return jobPosition;
    }

    public String getEmail() {
        return email;
    }

    public int getNumbers() {
        return phone;
    }

    public int getMane() {
        return salary;
    }

    public int getAge() {
        return age;
    }


   public void printEmployee() {
       System.out.println("\nPerson fullName:" + this.fullName + "\njobPosition:" + this.jobPosition + "\nemail:"
               + this.email + "\nphone:" + this.phone + "\nsalary:" + this.salary + "\nage:" + this.age);
    }
}
