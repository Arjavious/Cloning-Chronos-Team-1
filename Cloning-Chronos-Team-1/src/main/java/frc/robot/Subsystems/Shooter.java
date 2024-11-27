package frc.robot.Subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {

        //Instance
        private static Shooter instance;

        public static Shooter getInstance() {
            if (instance == null) {
                instance = new Shooter();
            }
    
            return getInstance();
        }

        //presets
        private TalonFX shooterMotor;
        private TalonFX shooterMotor2;

        //constructor
        public Shooter () {
            shooterMotor = new TalonFX(Constants.HardwarePorts.shooterMotor);
            shooterMotor2 = new TalonFX(Constants.HardwarePorts.shooterMotor2);
        }

        //Enum
        public enum shootingStates {
            FULL(1.0),
            P9(0.9),
            P8(0.8),
            P7(0.7),
            P6(0.6),
            P5(0.5),
            P4(0.4),
            P3(0.3),
            P2(0.2),
            P1(0.1),
            OFF(0);

            private double motorSpeed;

            public double getShootingStates() {
                return motorSpeed;
            }

            shootingStates(double motorSpeed) {
                this.motorSpeed = motorSpeed;
            }

        }

        //Setters
        public void setAllMotors (shootingStates state) {
            shooterMotor.set(state.motorSpeed);
            shooterMotor2.set(state.motorSpeed);
        }

        public void setMotor1 (shootingStates state) {
            shooterMotor.set(state.motorSpeed);
        }

        public void setMotor2 (shootingStates state) {
            shooterMotor2.set(state.motorSpeed);
        }

        //Getters
        public double getMotor1Velocity () {
            return shooterMotor.getVelocity().getValueAsDouble();
        }

        public double getMotor2Velocity () {
            return shooterMotor.getVelocity().getValueAsDouble();
        }

}
