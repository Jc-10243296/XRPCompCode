// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
  private final XRPServo m_armServo;

  private boolean armDown;

  /** Creates a new Arm. */
  public Arm() {
    // Device number 4 maps to the physical Servo 1 port on the XRP
    m_armServo = new XRPServo(4);
    armDown = false;
    
  }

  @Override
  public void periodic() {
    //This method will be called once per scheduler run
    if (armDown) {
      m_armServo.setAngle(0);
    } else {
      m_armServo.setAngle(90);
    }

    // System.out.println("Arm" + armDown);
  }

  /**
   * Set the current angle of the arm (0 - 180 degrees).
   *
   * @param angleDeg Desired arm angle in degrees
   */
  public void setAngle(double angleDeg) {
    m_armServo.setAngle(angleDeg);
  }

  public void toggleArm() {
    armDown = !armDown;
  }
}