public class rectangle implements Shape{
   private int length;
    private int breath;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public void printArea() {
        System.out.println((float)length*breath);
    }
}
