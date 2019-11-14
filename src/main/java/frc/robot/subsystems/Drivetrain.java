/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.commands.Drive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Wrapper drivetrain module that allows manual motor controls
 * in parallel with DifferentialDrive.
 */
public class Drivetrain extends Subsystem {
  Spark leftMotor = new Spark(RobotMap.LEFT_MOTOR_1_ID);
  Spark rightMotor = new Spark(RobotMap.RIGHT_MOTOR_1_ID);
  DifferentialDrive driveModule = new DifferentialDrive(leftMotor, rightMotor);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Drive());
  }

  /**
   * Wrapper for DifferentialDrive. Use as usual.
   * @param leftInput forwards movement, scale [0,1]
   * @param rightInput rotation, scale [0,1]
   */
  public void drive(double leftInput, double rightInput) {
    driveModule.arcadeDrive(leftInput, rightInput);
  }
  
  /**
   * Manual motor control.
   * @param leftInput power sent to left wheels, scale [0,1]
   * @param rightInput power sent to right wheels, scale [0,1]
   */
  public void moveForwards(double leftInput, double rightInput) {
    leftMotor.set(leftInput);
    rightMotor.set(rightInput);
  }
}
