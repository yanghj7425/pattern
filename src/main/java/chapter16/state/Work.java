package chapter16.state;

public class Work {

    private int hour;

    private boolean finished;

    private State state;


    public Work(int hour) {
        setHour(hour);
    }

    public void goOnProgram() {
        State s = getState();
        System.out.println(s.getClass().getSimpleName());
        s.program(this);
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        int stateCode = 4;
        if (hour < 12) {
            stateCode = State.FORENOON;
        } else if (hour < 13) {
            stateCode = State.NOON;
        } else if (hour < 17) {
            stateCode = State.AFTERNOON;
        }
        setState(stateCode);
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public State getState() {
        return state;
    }


    public void setState(int stateCode) {
        switch (stateCode) {
            case State.FORENOON:
                this.state = new ForenoonState();
                break;
            case State.NOON:
                this.state = new NoonState();
                break;
            case State.AFTERNOON:
                this.state = new AfterNoonState();
                break;
            case State.EVENING:
                this.state = new EveningState();
                break;
            case State.REST:
                this.state = new RestState();
                break;
            default:
                this.state = new RestState();
        }

    }
}
