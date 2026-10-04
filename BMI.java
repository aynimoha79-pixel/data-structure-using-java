package homework3;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    //constructor1
    public BMI(String name,int age,double weight,double height) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }

    //constructor2
    public BMI(String name,double weight, double height){
        this.name=name;
        this.age=20;
        this.weight=weight;
        this.height=height;
    }

    //Getter for name
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight() {
            return weight;
    }

    public double getHeight() {
            return height;
    }

    //calculate BMI
    public double getBMI(){
        return weight *703/(height*weight);
    }
    //BMI Status
    public String getStatus(){
        double bmi = getBMI();
        if (bmi < 18.5){
            return "underweight";
        } else if (bmi <25.0){
            return "Normal";
        } else if (bmi <30.0) {
            return "overweight";
        }
        else {
            return "Obese";
        }
    }
}

 class TestMain{
     public static void main(String[] args){
         BMI person = new BMI("ismail",17,56,1.78);
         System.out.println("name:" +person.getName());
         System.out.println("age:" +person.getAge());
         System.out.println("weight:" +person.getWeight());
         System.out.println("height:" +person.getHeight());
         System.out.println("BMI: %.2f%n"+person.getBMI());
         System.out.println("Status:" +person.getStatus());
     }

     }
