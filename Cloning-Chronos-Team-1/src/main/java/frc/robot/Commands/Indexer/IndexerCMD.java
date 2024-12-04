package frc.robot.Commands.Indexer;

import edu.wpi.first.math.trajectory.ExponentialProfile.State;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Indexer;
import frc.robot.Subsystems.Indexer.IndexerStates;
import java.util.Timer;
import java.util.TimerTask;
import com.fasterxml.jackson.databind.node.DecimalNode;

public class IndexerCMD extends Command {
    private final Indexer IndexerInstance = Indexer.getInstance();
    IndexerStates state;
    Timer clock = new Timer();
    

    //Constructor
    public IndexerCMD () {
        System.out.println("sup");
    }


    //initializes the command
    @Override
    public void initialize() {
        IndexerInstance.setSpeed(state.getSpeed());
        clock.schedule(null, 3000);
    }

    //finished?

    @Override
    public boolean isFinished() {
        
    }

    @Override
    public void end(boolean cool) {

    }


}
