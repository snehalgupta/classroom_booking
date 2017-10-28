import java.util.List;
import java.util.Map;

public class College {

	private List<Member> MemberList;
	private List<Admin> adminList;
	private List<Member> FacultyList;
	private List<Member> RequestList;
	private Map<Course,Room> Room_Courses;
	public List<Member> getMemberList() {
		return MemberList;
	}
	public void setMemberList(List<Member> memberList) {
		MemberList = memberList;
	}
	public List<Admin> getAdminList() {
		return adminList;
	}
	public void setAdminList(List<Admin> adminList) {
		this.adminList = adminList;
	}
	public List<Member> getFacultyList() {
		return FacultyList;
	}
	public void setFacultyList(List<Member> facultyList) {
		FacultyList = facultyList;
	}
	public List<Member> getRequestList() {
		return RequestList;
	}
	public void setRequestList(List<Member> requestList) {
		RequestList = requestList;
	}
	public Map<Course, Room> getRoom_Courses() {
		return Room_Courses;
	}
	public void setRoom_Courses(Map<Course, Room> room_Courses) {
		Room_Courses = room_Courses;
	}
	
	
	
	
}
