float SENSOR;
float TEMPERATURA;

void setup() {
  pinMode(SENSOR, INPUT);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  int SENSOR = analogRead(A0);
  TEMPERATURA = (5.0*SENSOR*100.0)/1024.0;
  Serial.println(TEMPERATURA);
  delay(500);

  if (TEMPERATURA > 0) {
    digitalWrite(9, HIGH);
  }else{digitalWrite(9, LOW);
  }

  if(TEMPERATURA >= 37.0){
    digitalWrite(8, HIGH);
  }else{digitalWrite(8, LOW);
  }
}
