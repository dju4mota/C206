public class Processo {
    private int burstTime;
    private int priority;
    private static int idGeral = 0;

    private int id;

    Processo(){
        this.burstTime = (int)Math.floor(Math.random() * (120 - 15 + 1) + 15);
        this.priority = (int)Math.floor(Math.random() * (20  + 1));
        this.id = idGeral;
        idGeral++;

    }

    public Processo(int burstTime, int priority) {
        this.burstTime = burstTime;
        this.priority = priority;
        this.id = idGeral;
        idGeral++;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Burst-Time: " + this.burstTime + " Priority: " + this.priority ;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}

