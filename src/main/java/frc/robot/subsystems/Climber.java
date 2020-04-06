/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PuertosClimber;

public class Climber extends SubsystemBase
{
  private CANSparkMax Climb;
  private Solenoid Sol1;
  private Solenoid Sol2;
  private Compressor Compresor;
  private CANEncoder ClimbEncoder;


  /**
   * Creates a new Climber.
   */
  public Climber()
  {
    Climb = new CANSparkMax(PuertosClimber.motorClimber, PuertosClimber.tipoMotor);

    Sol1 = new Solenoid(PuertosClimber.Solenoideder);
    Sol2 = new Solenoid(PuertosClimber.Solenoideizq);
    Compresor = new Compressor(PuertosClimber.CompressorPuerto);

    ClimbEncoder = Climb.getEncoder();

    
  }

  public void compressorSwitchon()
  {
    Compresor.setClosedLoopControl(true);
  }

  public void ActivateElevator()
  {
    Sol1.set(PuertosClimber.EstadoSolenoideActivado);
    Sol2.set(PuertosClimber.EstadoSolenoideActivado);
  }

  public void DesactivarElevator()
  {
    Sol1.set(PuertosClimber.EstadoSolenoideDesactivado);
    Sol2.set(PuertosClimber.EstadoSolenoideDesactivado);
  }

  public void ActivarMovimiento()
  {
    Climb.set(0.3);
    
  }

  public void DesactivarMovimiento()
  {
    Climb.set(0);
  }

  public void InvertirMovimiento()
  {
    Climb.set(-0.3);
  }




  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
