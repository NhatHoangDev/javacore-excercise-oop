package b3;

public class CandidateB extends Candidate{
    public static final String MON_TOAN = "TOAN";
    public static final String MON_SINH = "SINH";
    public static final String MON_HOA = "HOA";

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA +
                '}';
    }
}
