package Experiment06;

class Student {

	public final static int NUM_OF_TESTS = 3; // 设置成绩类型数量

	private String type;
	private String firstName;
	private String lastName;
	private int testGrade[] = new int[NUM_OF_TESTS];
	private int courseGrade;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// 计算总成绩
	public void computeCourseGrade() {
		this.courseGrade = 0;
		for (int i = 0; i < NUM_OF_TESTS; i++) {
			this.courseGrade += testGrade[i];
		}
	}

	public int[] getTestGrade() {
		return testGrade;
	}

	public void setTestsGrade(int testNum, int testGrade) {
		this.testGrade[testNum] = testGrade;
	}

	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	public int getCourseGrade() {
		return this.courseGrade;
	}

}