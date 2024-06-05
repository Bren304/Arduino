#include <Servo.h>

Servo miServo;  // Crear un objeto servo

int var = 90;

void setup() {
  miServo.attach(9);  // Adjuntar el servomotor al pin 9
  Serial.begin(9600);

  miServo.write(var);
  delay(2000);
}

void loop() {

  int val = analogRead(A0);
  int val2 = analogRead(A1);

  Serial.print("FotoR 1: ");
  Serial.print(val);
  Serial.print(" FotoR 2: ");
  Serial.print(val2);
  Serial.println();

  if (val > val2 + 20) {
    var = var - 1;
    if(var < 0){
      var = 0;
    }
  } else if (val < val2 + 20) {
    var = var + 1;
    if(var > 180){
      var = 180;
    }
  }

  Serial.print(var);

  miServo.write(var);
  delay(0);
}

