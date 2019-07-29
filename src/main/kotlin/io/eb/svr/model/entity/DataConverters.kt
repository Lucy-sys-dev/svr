package io.eb.svr.model.entity

import ch.qos.logback.classic.pattern.PropertyConverter
import io.eb.svr.model.enums.ServiceAppointmentStatus
import java.util.*
import javax.persistence.AttributeConverter
import javax.persistence.Converter

/**
 * Create by lucy on 2019-07-24
 **/
@Converter(autoApply = true)
class ServiceAppointmentStatusConverter : AttributeConverter<ServiceAppointmentStatus, String> {
//	override fun convertToDatabaseColumn(paymentType: ServiceAppointmentStatus): String {
//		return paymentType.name
//	}
//
//	override fun convertToEntityAttribute(value: String?): ServiceAppointmentStatus? {
////		return if (value == null) null else Arrays.stream(ServiceAppointmentStatus.values())
////			.filter { p -> p.name == value }
////			.findFirst()
////			.orElseThrow { IllegalArgumentException() }
//		return value?.run {
//			ServiceAppointmentStatus.values().find { it.name == value }
//				?: throw IllegalArgumentException("ServiceAppointmentStatus '$value' 为 ${ServiceAppointmentStatus::class.simpleName}。")
//		}
//
//	}

	override fun convertToDatabaseColumn(attribute: ServiceAppointmentStatus): String {
		return attribute.name
	}

	override fun convertToEntityAttribute(dbData: String): ServiceAppointmentStatus {
		return ServiceAppointmentStatus.values()
			.firstOrNull { it.name == dbData } ?: throw IllegalArgumentException("ServiceAppointmentStatus '$dbData' 为 ${ServiceAppointmentStatus::class.simpleName}。")
	}
}