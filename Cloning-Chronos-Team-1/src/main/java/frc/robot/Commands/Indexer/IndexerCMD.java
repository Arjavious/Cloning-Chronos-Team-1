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
    

    //Constructor
    public IndexerCMD (IndexerStates states) {
        this.state = states;
        System.out.println("state acquired");
    }


    //initializes the command
        
    @Override
    public void initialize() {
        IndexerInstance.setSpeed(state.getSpeed());
        TimerClass.start();
    }

    @Override
    public void end(boolean cool) {
        try {
            wait(2000);
            IndexerInstance.setSpeed(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
