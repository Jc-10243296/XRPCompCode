// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPRangefinder;
import edu.wpi.first.wpilibj.xrp.XRPReflectanceSensor;
import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BottomProxSensor extends SubsystemBase {
  private final XRPReflectanceSensor m_reflect;
  public double inches;
  public double meters;

  /** Creates a new Arm. */
  public BottomProxSensor() {
    m_reflect = new XRPReflectanceSensor();// Device number 4 maps to the physical Servo 1 port on the XRP
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public double getLeftReflect() {
    return m_reflect.getLeftReflectanceValue();
  }

  public double getRightReflect() {
    return m_reflect.getRightReflectanceValue();
  }
}
