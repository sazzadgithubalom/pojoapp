package com.mosambee.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * this model class is use for get message object from notifypro app and api for report. 
 * 
 * @author sazzad.alom
 * @version 1.0.0
 * @since 02-06-2023
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MessageEventDto {
	private String userName;
	private String id;
	private String event;
	private String clientid;
	private Payload payload;
	private String qos;
	private String publishReceivedAt;
	private String createdTime;
	private String reason;
	private String topic;
	private String publishTimestamp;
	private String timestamp;
	private String notificationIdentifier;
	private String partnerCode;
	private String qrAcquirer;
}
