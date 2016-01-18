package com.viktarkarahoda.photohelper.entity;


public class Order {
		private int idOrder;
		private int idUser;
		private String status;
		private String description;
		private String orderDate;
		private String orderDateComplete;
		private String emailNotify;
		private int idWorker;
		
		public int getIdOrder() {
			return idOrder;
		}
		public void setIdOrder(int idOrder) {
			this.idOrder = idOrder;
		}
		public int getIdUser() {
			return idUser;
		}
		public void setIdUser(int idUser) {
			this.idUser = idUser;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}
		public String getOrderDateComplete() {
			return orderDateComplete;
		}
		public void setOrderDateComplete(String orderDateComplete) {
			this.orderDateComplete = orderDateComplete;
		}
		public String getEmailNotify() {
			return emailNotify;
		}
		public void setEmailNotify(String emailNotify) {
			this.emailNotify = emailNotify;
		}
		public int getIdWorker() {
			return idWorker;
		}
		public void setIdWorker(int idWorker) {
			this.idWorker = idWorker;
		}
}
