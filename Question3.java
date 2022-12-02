import java.util.Scanner;

class Calculator{
    int integer_1, integer_2;
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    
        void Add(){
            try{
                System.out.println("Enter first integer: ");
                integer_1 = Integer.parseInt(sc1.next());
                System.out.println("Enter second integer: ");
                integer_2 = Integer.parseInt(sc2.next());
                int add = integer_1 + integer_2;
                System.out.println(integer_1 + " + " + integer_2 + " = " + add);
            }catch (NumberFormatException e){
            System.out.println("Number Format Exception: The numbers cannot be non-integer");
        }
    }
    void Subtract(){
            try{
                System.out.println("Enter first integer: ");
                integer_1 = Integer.parseInt(sc1.next());
                System.out.println("Enter second integer: ");
                integer_2 = Integer.parseInt(sc2.next());
                int subtract = integer_1 - integer_2;
                System.out.println(integer_1 + " - " + integer_2 + " = " + subtract);
            }catch (NumberFormatException e){
            System.out.println("Number Format Exception: The numbers cannot be non-integer");
        }
    }
    void Multiply(){
            try{
                System.out.println("Enter first integer: ");
                integer_1 = Integer.parseInt(sc1.next());
                System.out.println("Enter second integer: ");
                integer_2 = Integer.parseInt(sc2.next());
                int multiply = integer_1 * integer_2;
                System.out.println(integer_1 + " * " + integer_2 + " = " + multiply);
            }catch (NumberFormatException e){
            System.out.println("Number Format Exception: The numbers cannot be non-integer");
        }
    }
    void Divide(){
            try{
                System.out.println("Enter first integer: ");
                integer_1 = Integer.parseInt(sc1.next());
                System.out.println("Enter second integer: ");
                integer_2 = Integer.parseInt(sc2.next());
                double divide = integer_1 / integer_2;
                System.out.println(integer_1 + " / " + integer_2 + " = " + divide);
            }catch (NumberFormatException e){
            System.out.println("Number Format Exception: The numbers cannot be non-integer");
        }
    }
}

class Question3 {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();
        Calculator obj3 = new Calculator();
        Calculator obj4 = new Calculator();
        obj1.Add();
        obj2.Subtract();
        obj3.Multiply();
        obj4.Divide();
    }
}