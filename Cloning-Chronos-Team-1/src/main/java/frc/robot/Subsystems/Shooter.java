package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

        //Instance
        private static Shooter instance;

        public static Shooter getInstance() {
            if (instance == null) {
                instance = new Shooter();
            }
    
            return getInstance();
        }
}
