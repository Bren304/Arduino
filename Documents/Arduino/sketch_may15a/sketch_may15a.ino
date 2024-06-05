int E2, E3;

void setup() {
  pinMode(1, OUTPUT);
  pinMode(2, INPUT);
  pinMode(3, INPUT);
}

void loop() {
  E2 = digitalRead(2);
  E3 = digitalRead(3);
  
  if(E2 == HIGH && E3 == HIGH){
    digitalWrite(1, HIGH);
  } else {
    digitalWrite(1, LOW);
  }

  if(E2 == HIGH || E3 == HIGH){
    digitalWrite(1, HIGH);
  } else {
    digitalWrite(1, LOW);
  }

  if(E2 == HIGH ^ E3 == HIGH){
    digitalWrite(1, HIGH);
  } else {
    digitalWrite(1, LOW);
  }
}
