package frc.robot.Intake;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Intake;
import frc.robot.Subsystems.Intake.intakeStates;

public class IntakeCMD extends Command {
    //declare cmds
    private final Intake intakeInstance = Intake.getInstance();
    intakeStates state;

    //Constructor
    public IntakeCMD (intakeStates state) {
        this.state = state;
        System.out.println("State acquired");
    }

    //Initialize 
    @Override
    public void initialize () {
        intakeInstance.setMotorSpeed(state.getMotorSpeed());
    }

    //is Finished
    @Override
    public boolean isFinished() {
        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        
        return true;
    }

    //end
    @Override
    public void end (boolean isFinished) {
        isFinished = isFinished();
        if (isFinished == true) {

        intakeInstance.setMotorSpeed(0);
    }
}
}
