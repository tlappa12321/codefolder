Walker joe;

void setup() {
    size(1500, 700);
    joe = new Walker(width/2, height/2);
    sally = new Walker((int)random(0,width), (int)random(0,height), true);
    tim = new Walker((int)random(0,width), (int)random(0,height), true);
    sandra = new Walker((int)random(0,width), (int)random(0,height), true);
}

void draw() {
    background(255);
    joe.display();

    sally.display();
    sally.move(0);
    tim.display();
    time.move(0);
    sandra.display();
    sandra.move(0);
}

void mousePressed() {

}

void keyPressed() {
    // For arrows, use 'keyCode' and UP, DOWN, ENTER, etc...
    // For ACSII char's, use 'key' and 'a', 'w', etc...

    if (keyCode == UP || key == 'w') {
        joe.move(0);
    }
    else if (keyCode == RIGHT || key == 'd') {
        joe.move(1);
    }
    else if (keyCode == DOWN || key == 's') {
        joe.move(2);
    }
    else if (keyCode == LEFT || key == 'a') {
        joe.move(3);
    }
    
}