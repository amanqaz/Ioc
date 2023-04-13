public class square implements Shape{

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    private int side;

    public square(int side) {
        this.side = side;
    }

    @Override
    public void printArea() {
        System.out.println((float)side*side);
    }
}
