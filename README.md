# Caso1
El drive train no funciona!



Diagnóstico:

	El robot hace lo que le da la gana, el drivetrain cuando lo activo con el joystick de mi 
	control de xbox activa los motores pero escucho que truenan todos y no se mueve. No sé que hacer
	y no tengo bugs en el código.

Drivetrain:

	-Tanque con traction wheels

	- 3 motores por cada lado de drivetrain

	-Metodología de Esclavo y maestro

	-Arcade Drive
	
	-No utiliza funciones de PID





#Caso 1.5

El drive train no se mueve como yo quiero!



Diagnóstico:
	El drivetrain que yo quiero programar es un ArcadeDrive, pero el arcadeDrive no está funcionando
	como debe, cuando muevo mi joystick izquierdo de control de Xbox se mueve solo para la derecha mirando
	hacia adelante(Clockwise), y si muevo mi joystick derecho no hace nada, pero si lo muevo con el mismo
	joystick de forma horizontal se mueve hacia la dirección contraria (counterClockwise). No hay forma en 
	la que se pueda mover hacia adelante y yo solo quiero que pueda funcionar el ArcadeDrive, por favor ayuda.

Drivetrain:

	-Tanque con traction wheels

	- 3 motores por cada lado de drivetrain

	-Metodología de Esclavo y maestro

	-Arcade Drive (Está teniendo problemas)
	
	-No utiliza funciones de PID






#Caso 2

El Intake no funciona como quiero!

Queda media hora para el próximo Qual


src/main/java/frc/robot
Diagnóstico:
	Presiono los botones que le asigné a cada movimiento del intake sin embargo no está reaccionando, me 
	aparece en el Driver Station que los botones sí los detecta, pero no entiendo porqué no hacen nada los 
	motores, también cuando presiono los botones me aparece en los Falcon con un color Naranja estático, revisé
	los cables de los motores a la PDP y están bien conectados, los cables CAN están soldados a los colores de cada
	camino por lo tanto no hay problemas de conexiones eléctricas.
	Revisé mi programa y no hay nada que esté mal redactado, estoy seguro que todo está bien y ya lo revisé muchas
	veces y me estoy estresando mucho, por favor ayúdame a resolverlo.

Intake:
	-Un motor Falcon 500 en cada lado.  Es un intake de inicio que tiene llantas succionadoras (Estilo Dingo, dos motores Falcon)
	
	-Un motor Falcon 500 que tiene una llanta que funciona como lanzador. 
	
	-La pelota entra aventada por medio del Intake a un camino cubierto, donde llega directamente al lanzador y el
	lanzador activa el movimiento para expulsar 
	la pelota.
