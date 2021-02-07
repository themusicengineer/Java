public class Calculator {
  // Calculator constructor
  public Calculator() {

  }

  // public methods

  // add() adds two integers together
  public int add(int a, int b) {
    return a + b;
  }

  // subsctract() subtracts one integer from another
  public int subtract(int a, int b) {
    return a - b;
  }

  // multiply() multiplies integers together
  public int multiply(int a, int b) {
    return a * b;
  }

  // divide() divides integers together
  public int divide(int a, int b) {
    return a / b;
  }

  // modulo() gives the remainder
  public int modulo(int a, int b) {
    return a % b;
  }

  // main function
  public static void main(String[] args) {
    // Object instantiation
    Calculator myCalculator = new Calculator();
    // print to screen
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));

  }
}