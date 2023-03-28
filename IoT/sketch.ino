#define RED 1
#define YELLOW 5
#define GREEN 9
void setup() {
    pinMode(RED, OUTPUT);
    pinMode(YELLOW, OUTPUT);
    pinMode(GREEN, OUTPUT);
}

void loop() {
    digitalWrite(GREEN, HIGH);
    delay(3000);

    digitalWrite(GREEN, LOW);
    digitalWrite(YELLOW, HIGH);
    delay(5000);

    digitalWrite(YELLOW, LOW);
    delay(2000);
    digitalWrite(RED, HIGH);
    delay(500);
    digitalWrite(YELLOW, LOW);

    digitalWrite(RED, LOW);

}