package org.usfirst.frc.team4403.robot.commands;

import org.usfirst.frc.team4403.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class JoystickDrive extends Command {


	public JoystickDrive() {
        
        requires(Robot.chassis);
    }
    
    protected void initialize() {
    }

    protected void execute() {
    	 Robot.chassis.drive.arcadeDrive(Robot.oi.stick.getY(), -Robot.oi.stick.getX());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
