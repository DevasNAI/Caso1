/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotoresDrivetrain;

public class DriveTrain extends SubsystemBase
{
  private WPI_TalonSRX MotorLS1;
  private WPI_TalonSRX MotorLS2;
  
  private WPI_TalonSRX MotorRS1;
  private WPI_TalonSRX MotorRS2;

  private WPI_TalonSRX MotorLM;
  private WPI_TalonSRX MotorRM;

  private TalonSRXConfiguration Configu;

  private DifferentialDrive DifDrive;

  
  /**
   * Creates a new ExampleSubsystem.
   */
  public DriveTrain()
  {

    MotorLS1 = new WPI_TalonSRX(MotoresDrivetrain.Lmotor_S);
    MotorLS2 = new WPI_TalonSRX(MotoresDrivetrain.Lmotor_S2);
    MotorRS1 = new WPI_TalonSRX(MotoresDrivetrain.Rmotor_S);
    MotorRS2 = new WPI_TalonSRX(MotoresDrivetrain.Rmotor_S2);

    MotorLM = new WPI_TalonSRX(MotoresDrivetrain.Lmotor_M);
    MotorRM = new WPI_TalonSRX(MotoresDrivetrain.Rmotor_M);
    Configu = new TalonSRXConfiguration();

    DifDrive = new DifferentialDrive(MotorLM, MotorRM);

    //  Motores izquierdos
    MotorLS1.follow(MotorLM);
    MotorLS2.follow(MotorLS1);
    MotorLM.follow(MotorLS2);

    //  Motores derechos
    MotorRS1.follow(MotorRM);
    MotorRS2.follow(MotorLM);


    // Configuraciones
    MotorRM.configAllSettings(Configu);
    MotorLM.configAllSettings(Configu);

    MotorRM.configFactoryDefault();
    MotorLM.configFactoryDefault();


  }


  public void Manejo(double Vertical, double Giro)
  {
    DifDrive.arcadeDrive(-Vertical, Giro);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
