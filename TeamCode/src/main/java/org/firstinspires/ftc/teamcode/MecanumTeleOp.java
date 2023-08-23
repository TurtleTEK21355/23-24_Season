package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.MecanumHardware;

@TeleOp(group = "Scoot", name = "Mec")
public class MecanumTeleOp extends LinearOpMode{
    private MecanumHardware hardware;
    @Override
    public void runOpMode() {
        hardware = new MecanumHardware(this);
        hardware.drivetrainControl(gamepad1.right_stick_y, gamepad1.right_stick_x, gamepad1.left_stick_y);
    }
}
