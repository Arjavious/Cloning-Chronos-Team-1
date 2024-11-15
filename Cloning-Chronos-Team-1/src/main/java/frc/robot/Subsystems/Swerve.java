package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Swerve extends SubsystemBase {
 
        //Instance
        private static Swerve instance;

        public static Swerve getInstance() {
            if (instance == null) {
                instance = new Swerve();
            }
    
            return getInstance();
        }
}
