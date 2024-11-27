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

    //Motor states
    public enum IndexerStates {
        UP(0.75),
        OFF(0),
        DOWN(-0.5);

        private double speed;

        public double getSpeed() {
            return speed;
        }

        IndexerStates(double speed) {
            this.speed = speed;
        }
    }

    //Methods
    public void setSpeed(double voltage) {
        LeadMotor.set(voltage);
    }

    public void setSpeed(IndexerStates state) {
        LeadMotor.set(state.speed);
        followMotor.setControl(follow);
    }

    public double getMotorVoltage() {
        return LeadMotor.getMotorVoltage().getValueAsDouble();
    }
}
