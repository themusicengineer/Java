public class Droid {

    String name;
    int batteryLevel;
  
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    // toString() method
    public String toString() {
      return "Hello, I'm the droid: " + name + ".";
    }
  
    public void performTask(String task) {
      System.out.println(name + " is performing task: " + task);
    }
  
    public void energyReport() {
      System.out.println("Energy report. The battery remaining is: " + batteryLevel);
    }
  
    public void energyTransfer(Droid droidName1, int amountToTransfer, Droid droidName2) {
      int toTransfer = amountToTransfer;

      droidName1.batteryLevel = droidName1.batteryLevel - toTransfer; 
      droidName2.batteryLevel = droidName2.batteryLevel + toTransfer; 
  
    }
  
    // main method
    public static void main(String[] args) {
      Droid codey = new Droid("Codey");
      Droid margot = new Droid("Margot");
  
      System.out.println(codey);
      codey.performTask("dancing");
      codey.batteryLevel -= 10;
      margot.batteryLevel -= 25;
      System.out.println(codey.batteryLevel);
      System.out.println(margot.batteryLevel);
      codey.performTask("sliding");
      codey.performTask("singing");
      codey.energyReport();
      margot.energyReport();
  
      codey.energyTransfer(margot, 25, codey);
    }
  }