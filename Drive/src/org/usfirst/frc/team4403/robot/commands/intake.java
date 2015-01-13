package org.usfirst.frc.team4403.robot.commands;

import org.usfirst.frc.team4403.robot.Robot;
import org.usfirst.frc.team4403.robot.subsystems.Rollers;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class intake extends Command {

	boolean acabo = false;
	
    public intake() {
        requires(Robot.rollers);
        acabo = true;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.rollers.intake();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return acabo;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
