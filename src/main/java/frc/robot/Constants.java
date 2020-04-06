/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public final class Constants
{
    public static final class PuertosXbox
    {
        public static final int control1 = 0;

        public static final int boton_A = 1;
        public static final int boton_B = 2;
        public static final int boton_X = 3;
        public static final int boton_Y = 4;
        public static final int bumper_L = 5;
        public static final int bumper_R = 6;
        public static final int boton_Bk = 7;
        public static final int boton_S = 7;

    }

    public static final class MotoresDrivetrain
    {
        // Motores izquierdos
        public static final int Lmotor_S = 0;
        public static final int Lmotor_M = 1;
        public static final int Lmotor_S2 = 2;

        //  Motores derechos
        public static final int Rmotor_S = 3;
        public static final int Rmotor_M = 4;
        public static final int Rmotor_S2 = 5;
    }

    public static final class MotoresIntake
    {
        public static final int motorShooter = 6;
        public static final int motorIntake1 = 7;
        public static final int motorIntake2 = 8;

        public static final boolean InversionMotores = true;
        public static final boolean InversionMotoresfalsa = false;

    }

    public static final class PuertosClimber
    {
        public static final int motorClimber = 9;
        public static final MotorType tipoMotor = MotorType.kBrushless;
        
        public static final int Solenoideizq = 1;
        public static final int Solenoideder = 2;
        public static final int CompressorPuerto = 0;

        public static final boolean EstadoSolenoideActivado = true;
        public static final boolean EstadoSolenoideDesactivado = false;

    }




}
