package andersen.lesson3;


public class HomeWorkApp {
    public static void main(String[] args) {

        Employee person = new Employee("Stefan", "meneger", "stefan56425@gmail.com",
                663653521, 10000, 20);
        person.printEmployee();


        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Oliver", "actor", "oliver55425@gmail.com",
                663693521, 20000, 30);
        employeeArray[1] = new Employee("Jack", "dentist", "jack56456@gmail.com",
                663665521, 30000, 40);
        employeeArray[2] = new Employee("Jacob", "engineer", "jacob56525@gmail.com",
                663662621, 40000, 50);
        employeeArray[3] = new Employee("Charley", "taxi driver", "charley655@gmail.com",
                666563521, 50000, 60);
        employeeArray[4] = new Employee("Thomas", "doctor", "thomas55485@gmail.com",
                663653681, 60000, 70);

        for (int i=0; i < employeeArray.length; i++) {
            if (employeeArray [i].getAge() > 40) employeeArray [i].printEmployee();
        }
    }
}