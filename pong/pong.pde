import ddf.minim.*;
Minim minim;
AudioSample sound;
PImage bImage;
int ballX=10;
int ballY=100;
int ballYSpeed=10;
int ballSpeed=10;
void setup(){
  size(300,300);
  bImage=loadImage("pong.png");
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  background(0,0,100);
}
void draw(){
  image(bImage, 0, 0);
  image(bImage, 0, 0, width, height);
  fill(0,255,0);
  rect(mouseX-50,250,100,20);
  ballX+=ballSpeed;
  ballX+=ballYSpeed;
  background(0,0,100);
  fill(255,0,0);
  stroke(0,0,100);
  ellipse(ballX,ballY,10,10);
  if(ballY>=250&&ballX>mouseX-50&&ballX<mouseX+50){
  }
    
  if(ballX>=width){
    ballSpeed=-ballSpeed;
  }
  if(ballX<=0){
    ballSpeed=-ballSpeed;
  }
  if(ballY>=height){
    ballYSpeed=-ballYSpeed;
  }
  if(ballY<=0){
    ballYSpeed=-ballYSpeed;
    sound.trigger();
  }
}
