
PImage pictureOfRecord;                       
    int imageAngle = 0;

public void setup(){
  size(600,600);
   pictureOfRecord= loadImage("record.png"); 
    pictureOfRecord.resize(600,600);  
}

public void draw(){
   image(pictureOfRecord, 0, 0);
  
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
        draw();
}
