package structural.adapter;

public class SquareToRectangleAdapter extends Rectangle {
    public SquareToRectangleAdapter(Square square) {
        super(square.getSide(), square.getSide());
    }
}
