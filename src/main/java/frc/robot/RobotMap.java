/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // for Drivetrain
  public static final int LEFT_MOTOR_1_ID = 0;
  public static final int RIGHT_MOTOR_1_ID = 1;
  // for Arm subsystem
  public static final int ARM_MOTOR_ID = 2;
  public static final int SUCC_MOTOR_LEFT_ID = 3;
  public static final int SUCC_MOTOR_RIGHT_ID = 4;
  // Controller IDs and such
  public static final int CONTROLLER_PORT_ID = 0;
  public static final int LEFT_STICK_Y = 0;
  public static final int RIGHT_STICK_Y = 0;
}
