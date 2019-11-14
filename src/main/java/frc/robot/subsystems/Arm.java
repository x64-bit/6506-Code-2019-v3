/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.commands.MoveArm;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Arm subsystem, includes claw
 */
public class Arm extends Subsystem {
  Spark armMotor = new Spark(RobotMap.ARM_MOTOR_ID);
  Spark succMotor1 = new Spark(RobotMap.SUCC_MOTOR_LEFT_ID);
  Spark succMotor2 = new Spark(RobotMap.SUCC_MOTOR_RIGHT_ID);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new MoveArm());
  }

  /**
   * Sends voltage to the arm.
   * @param input value to pass to arm, scale [0,1]
   */
  public void move(double input) {
    armMotor.set(input);
  }

  /**
   * Sends voltage to the succ motors.
   * @param input value to pass to succ motors, scale [0,1]
   */
  public void succ(double input) {
    succMotor1.set(input);
    succMotor2.set(-input);
  }
}
