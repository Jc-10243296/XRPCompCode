// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  private XRPServo mServo;
  public boolean intaking;
  /** Creates a new Intake. */
  public Intake() {
    mServo = new XRPServo(5);
    intaking = false;
  }

  @Override
  public void periodic() {
    if (intaking) {
      intake();
    } else {
      nointake();
    }
    // System.out.println("Intake" + intaking);
  }

  public void intake() {
    mServo.setAngle(75 );
  }

  public void nointake() {
    mServo.setAngle(0);
  }

  public void toggleIntake() {
    intaking = !intaking;
  }
}
