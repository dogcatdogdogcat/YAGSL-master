package frc.robot.commands.other;

import edu.wpi.first.wpilibj2.command.Command;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;

public class Launch extends Command{
    private final VictorSPX rightLaunchMotor = new VictorSPX(0);
    private final VictorSPX leftLaunchMotor = new VictorSPX(0);

    @Override
    public void initialize(){
        rightLaunchMotor.set(VictorSPXControlMode.PercentOutput, 0.25);
        leftLaunchMotor.set(VictorSPXControlMode.PercentOutput, 0.25);
    }

        @Override
    public void execute() {
        rightLaunchMotor.set(VictorSPXControlMode.PercentOutput, 0.25);
        leftLaunchMotor.set(VictorSPXControlMode.PercentOutput, 0.25);

        System.out.println(rightLaunchMotor.getBusVoltage());
        System.out.println(leftLaunchMotor.getBusVoltage());

    }

    @Override
    public void end(boolean isFinished) {
        rightLaunchMotor.set(VictorSPXControlMode.Disabled, 0.0);
        leftLaunchMotor.set(VictorSPXControlMode.Disabled, 0.0);
    }

}
