void setup() {
  // put your setup code here, to run once:
  pinMode(3, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  for(int BRILLO = 0; BRILLO < 256; BRILLO++){
    analogWrite(3,BRILLO);
    delay(20);
  }
}
