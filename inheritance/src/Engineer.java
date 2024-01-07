public class Engineer extends Employee {

    private String[] skills;

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Engineer(String name, String department, double salary, String[] skills) {
        super(name, department, salary);
        setSkills(skills);
    }

}
