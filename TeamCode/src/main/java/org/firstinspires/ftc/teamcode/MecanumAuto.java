package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


public class MecanumAuto extends LinearOpMode{
    private MecanumHardware hardware;
    @Override
    public void runOpMode() {
        hardware = new MecanumHardware(this);
        waitForStart();
        hardware.drivetrainControl(0.2, 0, 0);
        sleep(5500);
        hardware.drivetrainControl(0, 0, 0.2);
        //turnything
    }
}
