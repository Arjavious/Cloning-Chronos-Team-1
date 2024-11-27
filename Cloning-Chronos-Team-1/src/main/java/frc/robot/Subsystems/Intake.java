package frc.robot.Subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase{

        //Instance
        private static Intake instance;

        public static Intake getInstance() {
            if (instance == null) {
                instance = new Intake();
            }
    
            return getInstance();
        }

        //Presets
        private TalonFX intakeMotor;

        //Config
        public Intake() {
            intakeMotor = new TalonFX(Constants.HardwarePorts.intakeMotor);
        }

        //Enum
        public enum intakeStates {
            ON(1.0),
            OFF(0),
            REV(-1.0);

            private double motorSpeed;

            public double getMotorSpeed() {
                return motorSpeed;
            }

            private intakeStates(double speed) {
                motorSpeed = speed;
            }
        }

        //methods
        public void setMotorSpeed(intakeStates state) {
            intakeMotor.set(state.motorSpeed);
        }

        public double getMotorVoltage () {
            return intakeMotor.getMotorVoltage().getValueAsDouble(); //we can use the voltage to see the state the motor is in
        }
        
}
