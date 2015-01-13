package org.usfirst.frc.team4403.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team4403.robot.subsystems.Chassis;
import org.usfirst.frc.team4403.robot.subsystems.Rollers;

public class Robot extends IterativeRobot {

	public static final Chassis chassis = new Chassis();
	public static final Rollers rollers = new Rollers();
	public static OI oi;
	
    Command autonomousCommand;

    public void robotInit() {
		oi = new OI();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }
    
    public void disabledInit(){
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
