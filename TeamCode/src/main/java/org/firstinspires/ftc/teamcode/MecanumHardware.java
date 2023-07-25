package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.PizzzzzzzzaGoodTurtleLib.MecanumDrivetrain;


public class MecanumHardware {
    private LinearOpMode myOpMode = null;

    private DcMotor leftFrontDrive;
    private DcMotor rightFrontDrive;
    private DcMotor leftBackDrive;
    private DcMotor rightBackDrive;


    private MecanumDrivetrain drivetrain;

    public MecanumHardware(LinearOpMode opmode) {
        myOpMode = opmode;
        init();
    }

    public void init() {
        leftFrontDrive = myOpMode.hardwareMap.get(DcMotor.class, "left_front_drive");
        rightFrontDrive = myOpMode.hardwareMap.get(DcMotor.class, "right_front_drive");
        leftBackDrive = myOpMode.hardwareMap.get(DcMotor.class, "left_back_drive");
        rightBackDrive = myOpMode.hardwareMap.get(DcMotor.class, "right_back_drive");
        rightFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        rightBackDrive.setDirection(DcMotor.Direction.REVERSE);

        drivetrain = new MecanumDrivetrain(rightFrontDrive, leftFrontDrive, rightBackDrive, leftBackDrive);
    }

    public void  drivetrainControl(double forwardPower, double strafePower, double turnPower) {
        drivetrain.drive(forwardPower, strafePower, turnPower);

    }


}