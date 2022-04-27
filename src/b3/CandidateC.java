package b3;

public class CandidateC extends Candidate{
    public static final String MON_VAN = "VAN";
    public static final String MON_SU = "SU";
    public static final String MON_DIA = "DIA";

    public CandidateC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA +
                '}';
    }
}
