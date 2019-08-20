package BridgePattern;

import BridgePattern.Dewelopers.CppDeveloper;
import BridgePattern.Dewelopers.JavaDeveloper;
import BridgePattern.Platforms.BankSystem;

public class ProgramCreator {
    public static void main(String[] args) {
        Program program = new BankSystem(new JavaDeveloper());
        program.developProgram();
    }
}
