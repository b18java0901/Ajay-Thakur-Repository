import java.io.Serializable;

public class Worker implements Serializable{
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
private String job;
private int salary;

}
