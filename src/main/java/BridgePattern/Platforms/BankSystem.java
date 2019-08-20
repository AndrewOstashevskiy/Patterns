package BridgePattern.Platforms;

import BridgePattern.Dewelopers.Developer;
import BridgePattern.Program;

public class BankSystem  extends Program {


    public BankSystem(Developer developer){
        super(developer);
    }

    @Override
    public void developProgram(){
        System.out.println("Program for Banks system in processing...");
        developer.writeCode();
    }
}
