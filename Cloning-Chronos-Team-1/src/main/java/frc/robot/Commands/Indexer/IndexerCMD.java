package frc.robot.Commands.Indexer;

import edu.wpi.first.math.trajectory.ExponentialProfile.State;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Indexer;
import frc.robot.Subsystems.Indexer.IndexerStates;

public class IndexerCMD extends Command {
    private final Indexer IndexerInstance = Indexer.getInstance();
    IndexerStates state;

    //Constructor
    public IndexerCMD () {
        System.out.println("sup");
    }


    //initializes the command
    @Override
    public void initialize() {
        IndexerInstance.setSpeed(state.getSpeed());
        
    }


}
