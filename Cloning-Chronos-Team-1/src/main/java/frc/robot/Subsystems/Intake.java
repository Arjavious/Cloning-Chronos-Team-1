package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{

        //Instance
        private static Intake instance;

        public static Intake getInstance() {
            if (instance == null) {
                instance = new Intake();
            }
    
            return getInstance();
        }   
}
