class Walker {
    int x, y; //Position Variables
    int size;
    int speed;
    boolean npc;
    int cr, cg, cb; 

    //Constructor
    Walker(int tempx, int tempy, boolean tempnpc) {
        x = tempx;
        y = tempy;
        size = 25;
        speed = 25;
        npc = tempnpc;
        cr = (int) random(o,255);
        cg = (int) random(o,255);
        cb = (int) random(o,255);

    }

    void display() {
        fill(cr, cg, cb,);
        //rect(xpos, ypos, width, height)
        rect(x, y, size, size); 
    }

    // dir var --> 0 = up, 1 = right, 2 = down, 3 = left
    void move(int dir) {

        if (npc) {
            dir = (int) random(0,3);

            if (dir==0) {
                y = y + speed;

            }
            if (dir==0) {
                y = y + speed;

            }

        }
        

    
        //move Up
        if (dir == 0) {
            y = y - speed;
        }
        //move right
        else if (dir == 1) {
            x = x + speed;
        }
        //move down
        else if (dir == 2) {
            y = y + speed;
        }
        //move left
        else if (dir == 3) {
            x = x - speed;
        }
    }
}


