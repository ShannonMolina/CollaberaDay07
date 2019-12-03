package interfaces2;

// Default methods in interfaces allow specification of implementation.
// Otherwise, methods in interfaces must be abstract (no method body).

public interface Alarm {

	default String turnAlarmOn() {
		return "Turning the alarm on.";
	}
	
	default String turnAlarmOff() {
		return "Turning the alarm off.";
	}
}
