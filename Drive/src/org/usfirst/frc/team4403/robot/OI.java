package org.usfirst.frc.team4403.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4403.robot.commands.Eject;
import org.usfirst.frc.team4403.robot.commands.Intake;
import org.usfirst.frc.team4403.robot.commands.LeftWheel;
import org.usfirst.frc.team4403.robot.commands.RightWheel;
import org.usfirst.frc.team4403.robot.commands.StopRollers;

public class OI {
    
    public Joystick stick = new Joystick(RobotMap.joystickPort);
    Button button1 = new JoystickButton(stick, 1);
    Button button2 = new JoystickButton(stick, 2);
    Button button4 = new JoystickButton(stick, 4);
    Button button5 = new JoystickButton(stick, 5);    
    Button button6 = new JoystickButton(stick, 6);
    
    public Joystick launchpad = new Joystick(RobotMap.launchpadPort);
    Button boton1 = new JoystickButton(launchpad, 1);

public OI(){
	 button1.whenPressed(new Intake());
	 button4.whenPressed(new Eject());
	 button1.whenReleased(new StopRollers());
	 button4.whenReleased(new StopRollers());
	 button5.whenPressed(new LeftWheel());
	 button6.whenPressed(new RightWheel());
	 
	 boton1.whenPressed(new Intake());
	 boton1.whenReleased(new StopRollers());
}

public double getY(){
	return stick.getRawAxis(1);
}

public double getX(){
	return stick.getRawAxis(4);
}

}
