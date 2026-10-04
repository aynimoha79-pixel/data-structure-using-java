 package homework;

 public class Employee {

        private int id;
        private String firstName;
        private String lastName;
        private int salary;

        // Constructor
        public Employee(int id, String firstName, String lastName, int salary) {
            this.id = id;    //this(id); //calling another constructor
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        // Getter for id
        public int getId() {
            return id;
        }

        // Getter for firstName
        public String getFirstName() {
            return firstName;
        }

        // Getter for lastName
        public String getLastName() {
            return lastName;
        }

        // Getter for salary
        public int getSalary() {
            return salary;
            // public int annualsalary(){
            // return salary *12;

        }

        // Setter for salary
        public void setSalary(int salary) {
            this.salary = salary;
        }

        // Return full name
        public String getName() {
            return firstName + " " + lastName;
        }

        // Calculate annual salary
        public int getAnnualSalary() {
            return salary * 12;
        }

        // Increase salary by percentage
        public int raiseSalary(int percent) {
            salary = salary + (salary * percent / 100);
            return salary;
        }

        // toString
        public String toString() {
            return "Employee[id=" + id
                    + ",name=" + getName()
                    + ",salary=" + salary + "]";
        }
    }

   class TestMain {

    public static void main(String[] args) {

        // Test constructor and toString()
        Employee e1 = new Employee(8, "ayni", "mohamed", 2500);
        System.out.println(e1);

        // Test Setters and Getters
        e1.setSalary(888);
        System.out.println(e1);

        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        // Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}
