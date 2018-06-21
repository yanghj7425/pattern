package chapter16.state;

public abstract class State {
    public static final int FORENOON = 0; // 上午
    public static final int NOON = 1;  //中午
    public static final int AFTERNOON = 2;// 下午
    public static final int EVENING = 3; //晚上
    public static final int REST = 4; // 休息
    public static final int SLEEP = 5; // 睡着了

    public void program(Work work) {
        if (isFinished(work)) {
            System.out.println("可以休息了");
        } else {
            mustBeDone(work);
        }
    }

    /**
     * @description 子类如果不覆盖此方法，则会无限递归，直至内存溢出
     * @param work
     */
    protected void mustBeDone(Work work) {
        nextHour(work);
        work.goOnProgram();
    }


    protected boolean isFinished(Work work) {
        return work.isFinished();
    }

    public void nextHour(Work work) {
        int hour = work.getHour();
        work.setHour(hour + 1);
    }
}
