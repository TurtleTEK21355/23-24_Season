package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.PizzzzzzzzaGoodTurtleLib.TwoWheelDrivetrains;

public class SquirtHardware {
    private LinearOpMode myOpMode = null;
    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private TwoWheelDrivetrains drive2;

    public SquirtHardware(LinearOpMode opmode) {
        myOpMode = opmode;
    }

    public void init()    {
        leftDrive  = myOpMode.hardwareMap.get(DcMotor.class, "motorLeft");
        rightDrive = myOpMode.hardwareMap.get(DcMotor.class, "motorRight");
        drive2 = new TwoWheelDrivetrains(leftDrive,rightDrive);

        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);

        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }

    public void arcadeDrive(double drive, double turn){
        drive2.arcadeDrive(drive,turn);
    }

    public void tankDrive(double leftWheel, double rightWheel) {
        drive2.tankDrive(leftWheel,rightWheel);
    }

}
