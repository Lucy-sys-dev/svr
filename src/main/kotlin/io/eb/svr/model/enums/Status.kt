package io.eb.svr.model.enums

/**
 * Create by lucy on 2019-07-11
 **/
enum class EmployeeStatus(val type: String, val desc: String) {
	ING("ING", "재직"),
	OUT("OUT", "퇴사"),
	STOP("STOP", "휴직"),
	REING("REING", "복직")
}

enum class ServiceAppointmentStatus(val type: String, val desc: String) {
	BOOKING("BOOKING", "예약"),
	COMPLETE("COMPLETE", "시술"),
	NOSHOW("NOSHOW", "노쇼"),
	CANCEL("CANCEL", "취소")
}

//enum class ServiceAppointmentStatus(val value: String) {
//	BOOKING("예약"),
//	COMPLETE("시술"),
//	NOSHOW("노쇼"),
//	CANCEL("취소");

//	var typeName: String = name
//
//	companion object {
//		fun from(name: String): ServiceAppointmentStatus? {
//			for (type in ServiceAppointmentStatus.values()) {
//				if (type.typeName.toUpperCase() === name.toUpperCase())
//					return type
//			}
//
//			throw IllegalArgumentException("No such type $name")
//		}
//	}
//}

