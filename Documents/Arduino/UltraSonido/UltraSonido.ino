  int TRIG = 10;
  int ECHO = 9;
  int DURACION;
  int DISTANCIA;

void setup() {
  pinMode(ECHO, INPUT);
  pinMode(TRIG, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  digitalWrite(TRIG, HIGH);
  delay(1);
  digitalWrite(TRIG, LOW);
  DURACION = pulseIn(ECHO, HIGH);
  DISTANCIA = DURACION/58,2;
  Serial.println(DISTANCIA);
  delay(500);
}
