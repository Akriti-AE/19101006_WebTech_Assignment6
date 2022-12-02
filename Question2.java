class Calculation{
    void Add(int number_1,int number_2){
        try{
            if (number_1 < 0 || number_2 < 0){
                throw new ArithmeticException ("Number cannot be negative");
            }
            else{
                double add = number_1 + number_2;
                System.out.println(add);
            }
        }catch (ArithmeticException e){
            System.out.println("One of the numbers is negative: Addition not alowed");
        }
    }
    
    void Subtract(int number_1,int number_2){
        try{
            if (number_1 < 0 || number_2 < 0){
                throw new ArithmeticException ("Number cannot be negative");
            }
            else{
                double subtract = number_1 - number_2;
                System.out.println(subtract);
            }
        }catch (ArithmeticException e){
            System.out.println("One of the numbers is negative: Substraction not allowed");
        }
    }
}

class Question2 {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.Add(3,0);
        calc.Subtract(0,-4);
    }
}