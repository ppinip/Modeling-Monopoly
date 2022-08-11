import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Square> squares;

    public Board ()
    {
        this.squares = new ArrayList<Square>();
    }

    public Square getSquares(Square oldLocation, int fvTotal) {
        final int area=40;
        int currentLocation = 0;
        for (int i = 0; i < area; i++) {
            if (oldLocation.equals(squares.get(i))){ //หา location เดิมว่าอยู่ index ไหนของ squre
                currentLocation = i; //เจอแล้วนำไปเท่ากับ location ปัจจุบัน
            }
        }
        int newLocation = currentLocation + fvTotal; //นำ location ปัจจุบันมาบวกกับแต้มที่ทอยลูกเต๋าได่
        if (newLocation > 40){ //ถ้าเดินเกินช่องที่ 40
            newLocation %= 40; //จะนำ location ใหม่มาหาเศษที่เหลือ แล้วเริ่มนับไปช่องที่ 1 ใหม่
        }
        return squares.get(newLocation); // return location ใหม่จากแต้มที่ทอยลูกเต๋าได้
    }
}
