import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;    
int rotate=0;
void setup(){
  minim=new Minim(this);
  size(600,600);
  pictureOfRecord=loadImage("record.jpeg");
  pictureOfRecord.resize(600,600);
  song = minim.loadFile("dankbeat.wav", 512);   //in the setup method
}
void draw(){
  image(pictureOfRecord, 0, 0);  //in draw method
  if(mousePressed){
    song.play();
    rotate+=25;
    rotateImage(pictureOfRecord,rotate);
    image(pictureOfRecord,0,0);
    song.pause();
  }
}
void rotateImage(PImage image, int amountToRotate) {
        translate(300,300);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
