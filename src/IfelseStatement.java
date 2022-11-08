public class IfelseStatement {
    public static void testIf() {
        int number = 10;
        if (number < 0) {
            System.out.println("The number is negative");
        }
        System.out.println("Statement outside if block");
    }

    public static void testIfelse() {
        String Language = "Java";
        if (Language == "Java") {
            System.out.println("Java Programming");
        }
    }

    public static void testIfElse2() {
        int number = -10;
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        if (number < 0) {
            System.out.println("Statement outside if..else block");
        }
    }

    public static void testIfElseifElse(){
        String day = "Monday";
        if(day == "Sunday"){
            System.out.println("Sunday");
        }
        else if(day == "Monday"){
            System.out.println("Monday");
        }
        else{
            System.out.print("ERROR Day");
        }
    }
    public static void nestedIfelse(){
        int age = 25;
        int weigh = 48;

        if(age >= 18){
            if(weigh >50 ){
                System.out.println("You are eligible to danate blood");
            }else {
                System.out.print("You are not eligible to danate blood");
            }
        }else {
            System.out.println("Age must be greater than 18");
        }
    }
}