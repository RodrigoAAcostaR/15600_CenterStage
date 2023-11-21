package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Elevator;

public class ElevadorGoToPosition extends CommandBase {
    Elevator elevator;
    double power;
    int setPoint;

    public ElevadorGoToPosition(Elevator elevator, double power, int setPoint){
        this.elevator = elevator;
        this.power = power;
        this.setPoint = setPoint;

        addRequirements(elevator);
    }

    @Override
    public void execute() {
        elevator.setPosition(power, setPoint);
    }

    @Override
    public boolean isFinished() {
        return elevator.isAtSetpoint();
    }
}
