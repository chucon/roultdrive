package org.usfirst.frc.team4403.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4403.robot.commands.eject;
import org.usfirst.frc.team4403.robot.commands.intake;

public class OI {
    
    public Joystick stick = new Joystick(RobotMap.joystickPort);
    Button button1 = new JoystickButton(stick, 1);
    Button button2 = new JoystickButton(stick, 2);

public OI(){
	 button1.whenPressed(new intake());
	 button2.whenPressed(new eject());
}

}
