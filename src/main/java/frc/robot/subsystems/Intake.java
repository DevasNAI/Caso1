/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants.MotoresIntake;

/**
 * Add your docs here.
 */
public class Intake extends Subsystem 
{
  private WPI_TalonFX MotorIntake1;
  private WPI_TalonFX MotorIntake2;
  private WPI_TalonFX Lanzador;

  private TalonFXConfiguration Configuracion;

  public Intake(){
    MotorIntake1 = new WPI_TalonFX(MotoresIntake.motorIntake1);
    MotorIntake2 = new WPI_TalonFX(MotoresIntake.motorIntake2);
    Lanzador = new WPI_TalonFX(MotoresIntake.motorShooter);
    Configuracion = new TalonFXConfiguration();


    MotorIntake1.setInverted(MotoresIntake.InversionMotoresfalsa);
    MotorIntake2.setInverted(MotoresIntake.InversionMotores);
    
    Lanzador.configFactoryDefault();
    MotorIntake1.configFactoryDefault();
    MotorIntake2.configFactoryDefault();





  }


  public void setAdelanteIntake()
  {
    MotorIntake1.set(TalonFXControlMode.PercentOutput, 0.35);
    MotorIntake2.set(TalonFXControlMode.PercentOutput, 0.35);
  }

  public void setAtrasIntake()
  {

    MotorIntake1.set(TalonFXControlMode.PercentOutput, -0.35);
    MotorIntake2.set(TalonFXControlMode.PercentOutput, -0.35);
    
  }

  public void setAdelanteLanza()
  {
    Lanzador.set(TalonFXControlMode.PercentOutput, .8);
  }

  public void setAtrasLanza()
  {
    Lanzador.set(TalonFXControlMode.PercentOutput, -.8);
  }

  public void setLanzazero()
  {
    Lanzador.set(TalonFXControlMode.PercentOutput, 0);
  }

  public void setzerontake()
  {

    MotorIntake1.set(TalonFXControlMode.PercentOutput, 0);
    MotorIntake2.set(TalonFXControlMode.PercentOutput, 0);
    
  }


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
