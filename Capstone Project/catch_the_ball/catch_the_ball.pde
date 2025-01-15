float paddleX, paddleY;
float paddleWidth = 60;
float paddleHeight = 10;
float ballX, ballY;
float ballSize = 20;
float ballSpeed = 5;
int score = 0;

void setup() {
  size(400, 600);
  paddleX = width/2 - paddleWidth/2;
  paddleY = height - 50;
  ballX = random(width - ballSize);
  ballY = 0;
}

void draw() {
  background(220);

  //Move the paddle with the mouse
  paddleX = mouseX - paddleWidth/2;
  paddleX = constrain(paddleX, 0, width - paddleWidth);


  //Move the ball
  ballY += ballSpeed;
  if (ballY > height) {
    ballX = random(width - ballSize);
    ballY = 0;
  }

  //Check for collision
  if (ballX > paddleX && ballX < paddleX + paddleWidth && ballY + ballSize > paddleY) {
    score++;
    ballSpeed += 0.5; //Increase difficulty
    ballY = 0;
    ballX = random(width - ballSize);
  }

  //Draw objects
  rect(paddleX, paddleY, paddleWidth, paddleHeight);
  ellipse(ballX, ballY, ballSize, ballSize);

  //Display score
  fill(0);
  textSize(20);
  text("Score: " + score, 10, 30);

}
