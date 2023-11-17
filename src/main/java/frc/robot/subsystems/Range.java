// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPRangefinder;
import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Range extends SubsystemBase {
  private final XRPRangefinder m_range;
  public double inches;
  public double meters;

  /** Creates a new Arm. */
  public Range() {
    m_range = new XRPRangefinder();// Device number 4 maps to the physical Servo 1 port on the XRP
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    inches = m_range.getDistanceInches();
    meters = m_range.getDistanceMeters();
    
  }

  public double getDistanceInches() {
    return inches;
  }

  public double getDistanceMeters() {
    return meters;
  }
}
