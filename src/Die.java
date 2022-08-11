import java.util.Random;

public class Die {

    private int faceValue;

    public Die()
    {
        this.faceValue = roll();
    }
    public int roll(){
        return faceValue = new Random().nextInt(6)+1; //สุ่มแต้มลูกเต๋า จาก 1-6 (บวก 1 เพราะ nextInt(6)สุ่มเลขจาก 0-5)
    }

    public int getFaceValue(){
        return faceValue;
    }
}
