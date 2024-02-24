package check;

import constants.Constants;

public class Main {
    // 課題１始まり
    private String firstName = "tanaka";
    private String lastName = "tanaka";
    // 課題１終わり
    
    public String getFirstName() {
         return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    
    // 課題２始まり
    private void printName() {
        System.out.println("printNameメソッド → " + getFirstName() + getLastName());
    }
    // 課題２終わり
    
  
    public static void main(String[] args) {
        Main main = new Main();
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        
        main.printName();
        pet.introduce();
        robo.introduce();        
    }
}
