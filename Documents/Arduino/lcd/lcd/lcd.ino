#include "LiquidCrystal.h"

LiquidCrystal lcd = LiquidCrystal(2,3,4,5,6,7);

void setup() {
  lcd.begin(16,2);
}

void loop() {
  lcd.setCursor(2,0);
  lcd.print("Hello World");
  lcd.setCursor(1,1);
  lcd.print("Buenas tardes");
}
