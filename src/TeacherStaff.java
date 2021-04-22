public class TeacherStaff {
   private Officers officers=new Officers();
   private int hardSalary;
   private int reward;
   private int punish;

    public TeacherStaff() {
    }

    public TeacherStaff(Officers officers, int hardSalary, int reward, int punish) {
        this.officers = officers;
        this.hardSalary = hardSalary;
        this.reward = reward;
        this.punish = punish;
    }

    public Officers getOfficers() {
        return officers;
    }

    public void setOfficers(Officers officers) {
        this.officers = officers;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getPunish() {
        return punish;
    }

    public void setPunish(int punish) {
        this.punish = punish;
    }

    @Override
    public String toString() {
        return "TeacherStaff{" +
                "officers=" + officers +
                ", hardSalary=" + hardSalary +
                ", reward=" + reward +
                ", punish=" + punish +
                '}';
    }
}
