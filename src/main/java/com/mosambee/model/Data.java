package com.mosambee.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * this child model class is use for get message object from notifypro app and api for report. 
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
public class Data {

	private String lang;
	private int transactionType;
	private String transactionAmount;
	private String deviceSerialNo;
	private int deviceCategory;
	private int transactionStatus;
	private String text;
	private String title;
	private String transactionId;
	
}
