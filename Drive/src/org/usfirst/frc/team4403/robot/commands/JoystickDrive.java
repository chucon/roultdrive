package org.usfirst.frc.team4403.robot.commands;

import org.usfirst.frc.team4403.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class JoystickDrive extends Command {


	public JoystickDrive(){        
        requires(Robot.drive);
    }
    
    protected void initialize() {
    }

    protected void execute() {
    	 Robot.drive.roultDrive(Robot.oi.getY(), -Robot.oi.getX());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
