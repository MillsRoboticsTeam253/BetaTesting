package org.usfirst.frc253.Code2016.subsystems;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Camera extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	int currSession;
	int sessionfront;
	int sessionback;
	Image frame;
	frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);

	sessionfront = NIVision.IMAQdxOpenCamera("cam1", NIVision.IMAQdxCameraControlMode.CameraControlModeController);
	        
	sessionback = NIVision.IMAQdxOpenCamera("cam2", NIVision.IMAQdxCameraControlMode.CameraControlModeController);

	currSession = sessionfront;

	NIVision.IMAQdxConfigureGrab(currSession);


    public void initDefaultCommand() {
        public Camera() {
        	super();
//        	 motor1 = new Talon (5);
//        	 motor2 = new Talon (4);
        	 CameraOne();
        	 CameraTwo();
        	 
        }

    public void CameraOne() {
    	;	
    }
    public void CameraTwo() {
    	m.set(0);
    }

    public void PickUp() {
    m.set(0.8);


    }
    }