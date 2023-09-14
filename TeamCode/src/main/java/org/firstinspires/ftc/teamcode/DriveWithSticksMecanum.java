package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="MecanumTest", group="Turtle Group")
public class DriveWithSticksMecanum extends LinearOpMode {
    RobotHardware_TT   robot       = new RobotHardware_TT(this);
    @Override
    public void runOpMode() {
        robot.init();
        waitForStart();
        while (opModeIsActive()) {

            double Strafe = 0;
            double Turn = 0;
            double Drive = 0;

        }
    }
            

            if (-gamepad1.left_stick_x < 0) {
                Strafe = -Math.pow(-gamepad1.left_stick_x, 2);
            } else {
                Strafe = Math.pow(-gamepad1.left_stick_x, 2);
            }

            if (-gamepad1.right_stick_x < 0) {
                Turn = -Math.pow(-gamepad1.right_stick_x, 2);
            } else {
                Turn = Math.pow(-gamepad1.right_stick_x, 2);
            }

            if (gamepad1.left_stick_y < 0) {
                Drive = -Math.pow(gamepad1.left_stick_y, 2);
            } else {
                Drive = Math.pow(gamepad1.left_stick_y, 2);
            }

            robot.mecanumDrive(Strafe * 0.5, Turn * 0.5, Drive * 0.5);
        }
    }
}
