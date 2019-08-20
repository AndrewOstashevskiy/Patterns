package BridgePattern.Platforms;

import BridgePattern.Dewelopers.Developer;
import BridgePattern.Program;

public class TradingPlatform extends Program {

    public TradingPlatform(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Program for Trading platform in processing...");
        developer.writeCode();
    }
}
