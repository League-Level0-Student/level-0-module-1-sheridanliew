import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch
void setup() {
    size(500, 500);
    fill(200, 175, 125);
    ellipse(250, 250, 300, 300);
    fill(150, 50, 50);
    ellipse(250, 250, 250, 250);
    fill(255, 245, 134);
    ellipse(250, 250, 225, 225);
    minim = new Minim(this);      //in the setup method 
    sound = minim.loadFile("159376__greenhourglass__boing1.wav");      //in the setup method
}
void draw() {
  PImage sausage = loadImage("sausage.ppm.gif");
  sausage.resize(35, 35);
PImage mushroom = loadImage("mushroom.ppm.gif");
  mushroom.resize(35, 35);
if(mousePressed){
  sound.play();
  image(mushroom, mouseX+35, mouseY+35);
  image(sausage, mouseX, mouseY);
}
}