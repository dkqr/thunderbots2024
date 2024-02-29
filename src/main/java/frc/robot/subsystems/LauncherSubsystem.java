package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LauncherSubsystem extends SubsystemBase {

    Spark topMotor = new Spark(Constants.pwmTopLauncher);
    Spark bottomMotor = new Spark(Constants.pwmBottomLauncher);

    public LauncherSubsystem() {

    }
    public void setSpeed(double speed) {
        topMotor.set(speed);
        bottomMotor.set(speed);
    }

    public void setTopMotor(double speed) {
        topMotor.set(speed);
    }

    public void setBottomMotor(double speed) {
        bottomMotor.set(speed);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}