package frc.robot.Shooter;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Shooter;
import frc.robot.Subsystems.Shooter.shootingStates;

public class ShooterCMD extends Command {
    private final Shooter ShooterInstance = Shooter.getInstance();
    shootingStates state;

    //Constructor
    public ShooterCMD (shootingStates state) {
        this.state = state;
        System.out.println("state acquired");
    }

    //initialize
    @Override
    public void initialize() {
        ShooterInstance.setAllMotors(shootingStates.P5);
    }

    //Execute
    @Override
    public void execute() {
        System.out.println("Motor active");
    }

    //IsFinished?
    @Override
    public boolean isFinished() {
        try {
            wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return true;
    }

    //end
    @Override
    public void end(boolean finished) {
        finished = isFinished();
        if (isFinished() == true) {
            ShooterInstance.setAllMotors(shootingStates.OFF);
        }
    }
}
