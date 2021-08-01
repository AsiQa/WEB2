package model;



public class Response {

    private Action action;
    private int numbOfWands;

    public Response() {
    }

    public void setNumbOfWands(int numbOfWands) {
        this.numbOfWands = numbOfWands;
    }

    public int getNumbOfWands() {
        return numbOfWands;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Response{" +
                "action=" + action +
                ", numbOfWands=" + numbOfWands +
                '}';
    }
}
