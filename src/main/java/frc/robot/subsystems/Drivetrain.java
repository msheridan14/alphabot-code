/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  Spark leftBackSpark = null;
  Spark leftFrontSpark = null;
  Spark rightBackSpark = null;
  Spark rightFrontSpark = null;

  public DifferentialDrive differentialDrive = null;

  public Drivetrain() {
    //sparks
    leftBackSpark = new Spark(RobotMap.DRIVETRAIN_LEFT_BACK_SPARK);
    leftFrontSpark =  new Spark(RobotMap.DRIVETRAIN_LEFT_FRONT_SPARK);
    rightBackSpark =  new Spark(RobotMap.DRIVETRAIN_RIGHT_BACK_SPARK);
    rightFrontSpark =  new Spark(RobotMap.DRIVETRAIN_RIGHT_FRONT_SPARK);

    SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftFrontSpark, leftBackSpark);
    SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightFrontSpark, rightBackSpark);
    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);

  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
