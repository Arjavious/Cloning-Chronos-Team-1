// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Commands.Indexer.IndexerCMD;
import frc.robot.Intake.IntakeCMD;
import frc.robot.Shooter.ShooterCMD;
import frc.robot.Subsystems.Indexer;
import frc.robot.Subsystems.Intake;
import frc.robot.Subsystems.Shooter;
import frc.robot.Subsystems.Indexer.IndexerStates;
import frc.robot.Subsystems.Intake.intakeStates;
import frc.robot.Subsystems.Shooter.shootingStates;

public class RobotContainer {

  //Imported Controller buttons/joystick
  public final CommandXboxController driver = new CommandXboxController(0);

  private final Indexer sub_Indexer = Indexer.getInstance();
  private final Intake sub_Intake = Intake.getInstance();
  private final Shooter sub_Shooter = Shooter.getInstance();

  //Initializing Controller buttons
  private final Trigger buttonA = driver.a();
  private final Trigger buttonB = driver.b();
  private final Trigger buttonX = driver.x();
  private final Trigger buttonY = driver.y();

  public CommandXboxController configBindings() {
    return driver;
  }

  private void configureBindings() {
    driver.a().onTrue(new IndexerCMD(IndexerStates.UP));
    driver.b().onTrue(new IntakeCMD(intakeStates.ON));
    driver.x().onTrue(new ShooterCMD(shootingStates.P5));
  }

public RobotContainer() {
    configureBindings();
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
