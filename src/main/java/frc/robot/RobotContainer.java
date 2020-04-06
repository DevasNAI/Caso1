/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import static frc.robot.Constants.PuertosXbox.*;

import frc.robot.subsystems.Climber;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private final DriveTrain driveTrain = new DriveTrain();
  private final Intake Infeed = new Intake();
  private final Climber climb = new Climber();


  private final XboxController Control1 = new XboxController(control1);


  private Button botonA = new JoystickButton(Control1, boton_A);
  private Button botonB = new JoystickButton(Control1, boton_B);
  private Button botonX = new JoystickButton(Control1, boton_X);
  private Button botonY = new JoystickButton(Control1, boton_Y);


  private Button BumperL = new JoystickButton(Control1, bumper_L);
  private Button BumperR = new JoystickButton(Control1, bumper_R);








  private double speedMod;

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();


    // Drive Train tipo Arcade
    driveTrain.setDefaultCommand(
      new RunCommand(
        () -> driveTrain.Manejo(getAdelante(), getGiros()),
         driveTrain)
      );
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings()
  {
    // Intake
    botonX
      .whenPressed(new InstantCommand(() -> Infeed.setAdelanteIntake()))
      .whenReleased(new InstantCommand(() -> Infeed.setzerontake()));

    botonY
      .whenPressed(new InstantCommand(() -> Infeed.setAtrasIntake()))
      .whenReleased(new InstantCommand(() -> Infeed.setzerontake()));     
 
    // Lanzador
    botonB
      .whenPressed(new InstantCommand(() -> Infeed.setAtrasLanza()))
      .whenReleased(new InstantCommand(() -> Infeed.setLanzazero())); 
    botonA
     .whenPressed(new InstantCommand(() -> Infeed.setAdelanteLanza()))
     .whenReleased(new InstantCommand(() -> Infeed.setLanzazero())); 


    BumperR.whenPressed(new InstantCommand(() -> climb.ActivateElevator()))
           .whenReleased(new InstantCommand(() -> climb.DesactivarElevator()));

    BumperL.whenPressed(new InstantCommand(() -> climb.DesactivarMovimiento()));
    


  }


  // Declaro mi Joystick de movimiento vertical

  public double getAdelante()
  {
    return Control1.getRawAxis(1);
  }

  // Declaro mi joystick para movimiento horizontal

  public double getGiros()
  {
    return Control1.getRawAxis(4);
  }


  public double modifyInput(double value) {
    // Deadband
    if (Math.abs(value) < 0.1) {
      return 0;
    }
		// Modify the inputed speed based on which speed mode is currently active
    return value * speedMod;
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   *
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return ;
  }
  */
}
