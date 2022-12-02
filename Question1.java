class Calculation{
    void multiply(int number_1,int number_2){
        try{
            if (number_1 ==0 || number_2==0){
                throw new ArithmeticException ("Number cannot be zero");
            }
            else{
                double multiply = number_1 * number_2;
                System.out.println(multiply);
            }
        }catch (ArithmeticException e){
            System.out.println("One of the numbers is zero: Multiplication not alowed");
        }
    }
    
    void division(int number_1,int number_2){
        try{
            if (number_1 ==0 || number_2==0){
                throw new ArithmeticException ("Number cannot be zero");
            }
            else{
                double divide = number_1 / number_2;
                System.out.println(divide);
            }
        }catch (ArithmeticException e){
            System.out.println("One of the numbers is zero: Division not allowed");
        }
    }
}

class Question1 {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.multiply(3,0);
        calc.division(0,4);
    }
}