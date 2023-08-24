package check;

import constants.Constants;

public class Main {
    
    private String firstName = "斉藤";
    private String lastName = "圭介";
    
    private void printName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("printNameメソッド " + "→ " + firstName + lastName);
    }
    public static void main(String[] args) {
        Main main = new Main();
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        
        main.printName("斉藤", "圭介");
        pet.introduce();
        robo.introduce();
        
    }

}
