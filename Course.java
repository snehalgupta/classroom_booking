import java.util.List;

public class Course {
public Room room_allocated;
public String TimeStamp;
public int audience;
public List<String> postconditions;
public List<String> preconditions;
public boolean findkeyword(String tomatch)
{
	for(String find : preconditions)
	{
		if(find.equals(tomatch))
		{
			return true;
		}
	}
	for(String find : postconditions)
	{
		if(find.equals(tomatch))
		{
			return true;
		}
	}
	return false;
}
public Room getRoom_allocated() {
	return room_allocated;
}
public void setRoom_allocated(Room room_allocated) {
	this.room_allocated = room_allocated;
}
public String getTimeStamp() {
	return TimeStamp;
}
public void setTimeStamp(String timeStamp) {
	TimeStamp = timeStamp;
}
public int getAudience() {
	return audience;
}
public void setAudience(int audience) {
	this.audience = audience;
}
public List<String> getPostconditions() {
	return postconditions;
}
public void setPostconditions(List<String> postconditions) {
	this.postconditions = postconditions;
}
public List<String> getPreconditions() {
	return preconditions;
}
public void setPreconditions(List<String> preconditions) {
	this.preconditions = preconditions;
}

}
