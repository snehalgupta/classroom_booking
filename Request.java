import java.io.Serializable;

public class Request implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 4867907038588692507L;
String purpose;
Room prefered_room;
int Capacity;
int pending_days;
boolean status;
String getPurpose() {
	return purpose;
}
void setPurpose(String purpose) {
	this.purpose = purpose;
}
Room getPrefered_room() {
	return prefered_room;
}
void setPrefered_room(Room prefered_room) {
	this.prefered_room = prefered_room;
}
int getCapacity() {
	return Capacity;
}
void setCapacity(int capacity) {
	Capacity = capacity;
}
int getPending_days() {
	return pending_days;
}
void setPending_days(int pending_days) {
	this.pending_days = pending_days;
}
boolean isStatus() {
	return status;
}
void setStatus(boolean status) {
	this.status = status;
}




}
