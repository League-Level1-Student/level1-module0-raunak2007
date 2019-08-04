int dropY=10;
int randomNumber;
int score=0;
void setup(){
  size(300,300);
}
void draw(){
  background(0,255,255);
  fill(100,150,0);
  rect(mouseX-50,250,100,50);
  dropY+=10;
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  fill(0,0,200);
  stroke(0,0,150);
  ellipse(randomNumber,dropY,12,25);
  if(dropY>=300){
    checkCatch(randomNumber);
    randomNumber=(int) random(width);
    dropY=10;
    stroke(0,0,150);
    ellipse(randomNumber,dropY,12,25);
}
}
void checkCatch(int x){
  if(x>=mouseX-50&&x<=mouseX+50){
    score++;
}
  else if(score>=0){
    score--;
    println("Your score is still: "+score);
  }
}
