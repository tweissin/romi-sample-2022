package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.OnBoardIO;

public class SetGreenLightOn extends CommandBase {
    private final OnBoardIO m_io;
    private boolean m_greenLed = false;

    public SetGreenLightOn(OnBoardIO io, boolean greenLed) {
        m_io = io;
        m_greenLed = greenLed;
        addRequirements(io);
    }

    @Override
    public void execute() {
        m_io.setGreenLed(m_greenLed);
    }
}
