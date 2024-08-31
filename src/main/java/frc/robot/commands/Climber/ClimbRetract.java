package frc.robot.commands.Climber;

import frc.robot.Constants.ClimberConstants.ClimberMode;
import frc.robot.subsystems.Climber.Climber;

public class ClimbRetract extends ClimberBase {
  public ClimbRetract(Climber climber) {
    super(climber, ClimberMode.RETRACT);
  }
}
