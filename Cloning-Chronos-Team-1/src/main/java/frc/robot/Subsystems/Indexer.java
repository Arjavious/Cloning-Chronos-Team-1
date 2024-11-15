package frc.robot.Subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Indexer extends SubsystemBase {

    //Instance
    private static Indexer instance;

    public static Indexer getInstance() {
        if (instance == null) {
            instance = new Indexer();
        }

        return getInstance();
    }

    //Initialize motor
    private TalonFX LeadMotor;
    private TalonFX followMotor;

    private Follower follow = new Follower(Constants.HardwarePorts.indexerMotorFollow, false);

    //Configure motors
    public Indexer () {
        LeadMotor = new TalonFX(Constants.HardwarePorts.indexerMotorLead);
        followMotor = new TalonFX(Constants.HardwarePorts.indexerMotorFollow);
    }
}
