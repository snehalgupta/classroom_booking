import java.util.List;

public class Student {
	private List<Course> TimeTable;
	public  List<Request> MY_Req;

	public List<Course> search(List<String> r) {
		List<Course> returncourse = null;
		for(String sesa :r) {
//			for(Course c:thisCollege.CourseList) {
//				if(c.findkeyword(sesa)) {
//					returncourse.add(c)
//
//				}
//		}
		}
		return returncourse;
	}

	public Request Booking() {
		return null;
		
	}

	public List<Course> getTimeTable() {
		return TimeTable;
	}

	public void setTimeTable(List<Course> timeTable) {
		TimeTable = timeTable;
	}

	public List<Request> getMY_Req() {
		return MY_Req;
	}

	public void setMY_Req(List<Request> mY_Req) {
		MY_Req = mY_Req;
	}
	
	
	
	
}
