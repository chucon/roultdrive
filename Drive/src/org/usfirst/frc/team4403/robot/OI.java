package org.usfirst.frc.team4403.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4403.robot.commands.LeftWheel;
import org.usfirst.frc.team4403.robot.commands.RightWheel;
import org.usfirst.frc.team4403.robot.commands.StopRollers;
import org.usfirst.frc.team4403.robot.commands.eject;
import org.usfirst.frc.team4403.robot.commands.intake;

public class OI {
    
    public Joystick stick = new Joystick(RobotMap.joystickPort);
    Button button1 = new JoystickButton(stick, 1);
    Button button2 = new JoystickButton(stick, 2);
    Button button4 = new JoystickButton(stick, 4);
    Button button5 = new JoystickButton(stick, 5);

public OI(){
	 button1.whenPressed(new intake());
	 button2.whenPressed(new eject());
	 button1.whenReleased(new StopRollers());
	 button2.whenReleased(new StopRollers());
	 button4.whenPressed(new LeftWheel());
	 button5.whenPressed(new RightWheel());
}

}
