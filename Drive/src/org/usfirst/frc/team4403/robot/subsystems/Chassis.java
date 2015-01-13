package org.usfirst.frc.team4403.robot.subsystems;

import org.usfirst.frc.team4403.robot.RobotMap;
import org.usfirst.frc.team4403.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem {
    
    public RobotDrive drive = new RobotDrive(RobotMap.leftMotor, RobotMap.rightMotor);

    public void initDefaultCommand() {
        
        setDefaultCommand(new JoystickDrive());
    }
    
}

