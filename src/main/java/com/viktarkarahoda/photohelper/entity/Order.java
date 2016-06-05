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
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + ((emailNotify == null) ? 0 : emailNotify.hashCode());
			result = prime * result + idOrder;
			result = prime * result + idUser;
			result = prime * result + idWorker;
			result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
			result = prime * result + ((orderDateComplete == null) ? 0 : orderDateComplete.hashCode());
			result = prime * result + ((status == null) ? 0 : status.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (emailNotify == null) {
				if (other.emailNotify != null)
					return false;
			} else if (!emailNotify.equals(other.emailNotify))
				return false;
			if (idOrder != other.idOrder)
				return false;
			if (idUser != other.idUser)
				return false;
			if (idWorker != other.idWorker)
				return false;
			if (orderDate == null) {
				if (other.orderDate != null)
					return false;
			} else if (!orderDate.equals(other.orderDate))
				return false;
			if (orderDateComplete == null) {
				if (other.orderDateComplete != null)
					return false;
			} else if (!orderDateComplete.equals(other.orderDateComplete))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			return true;
		}
		
		
}
