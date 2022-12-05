package system2;

public class People {
	protected String name;
	protected int number;
	protected String sex;

	public People(String name, int number, String sex) {
		this.name = name;
		this.number = number;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
