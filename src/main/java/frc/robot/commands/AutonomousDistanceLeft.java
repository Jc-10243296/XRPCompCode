// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistanceLeft extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistanceLeft(Drivetrain drivetrain) {
    addCommands(
      new DriveDistance(Constants.speed1, Constants.distance1, drivetrain),
      new Wait(0.5),
      new TurnTime(1, 0.6, drivetrain),
      new Wait(0.5),
      new DriveDistance(Constants.speed2, Constants.distance2, drivetrain));
  }
}
