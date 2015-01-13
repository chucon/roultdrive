package org.usfirst.frc.team4403.robot.subsystems;

import org.usfirst.frc.team4403.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Rollers extends Subsystem {
    
    Jaguar leftRoller = new Jaguar(RobotMap.leftRoller);
    Jaguar rightRoller = new Jaguar(RobotMap.rightRoller);

    public void initDefaultCommand() {
        
    }
    
    public void intake(){
    	leftRoller.set(-0.5);
    	rightRoller.set(0.5);
    }
    
    public void eject(){
    	leftRoller.set(0.5);
    	rightRoller.set(-0.5);
    }
}

