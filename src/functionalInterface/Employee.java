package functionalInterface;

public class Employee {

		private String name;
		private Double sal;
		private String deptName;

		public Employee(String name, Double sal, String deptName) {
			super();
			this.name = name;
			this.sal = sal;
			this.deptName = deptName;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getSal() {
			return sal;
		}
		public void setSal(Double sal) {
			this.sal = sal;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", sal=" + sal + ", deptName=" + deptName + "]";
		}
}
