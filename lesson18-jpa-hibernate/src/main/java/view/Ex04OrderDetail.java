package view;

import persistence.OrderDetail.Id;
import service.OrderDetailService;
import service.OrderDetailServiceImpl;
import utils.IoUtils;

public class Ex04OrderDetail {
	
private static OrderDetailService orderDetailService;
	
	static {
		orderDetailService = new OrderDetailServiceImpl();
	}
	
	public static void main(String[] args) {
		
		IoUtils.generate("4. Liệt kê chi tiết đơn hàng [@ManyToMany]", orderDetailService.get(new Id(2, 5)));
		
	}
}


//CREATE TABLE T01_POST (
//	    C01_ID INT NOT NULL AUTO_INCREMENT,
//	    C01_TITLE VARCHAR(255) NOT NULL,
//	    C01_CONTENT TEXT,
//	    PRIMARY KEY (C01_ID)
//	);
//
//	CREATE TABLE T02_TAG (
//	    C02_ID INT NOT NULL AUTO_INCREMENT,
//	    C02_NAME VARCHAR(100) NOT NULL,
//	    PRIMARY KEY (C02_ID),
//	    UNIQUE KEY UK_T02_TAG_NAME (C02_NAME)
//	);
//	CREATE TABLE T03_POST_TAG_REL (
//	    C03_POST_ID INT NOT NULL,
//	    C03_TAG_ID  INT NOT NULL,
//
//	    PRIMARY KEY (C03_POST_ID, C03_TAG_ID),
//
//	    CONSTRAINT FK_T03_T01_REL_POST
//	        FOREIGN KEY (C03_POST_ID)
//	        REFERENCES T01_POST (C01_ID)
//	        ON DELETE CASCADE,
//
//	    CONSTRAINT FK_T03_T02_REL_TAG
//	        FOREIGN KEY (C03_TAG_ID)
//	        REFERENCES T02_TAG (C02_ID)
//	        ON DELETE CASCADE
//	);