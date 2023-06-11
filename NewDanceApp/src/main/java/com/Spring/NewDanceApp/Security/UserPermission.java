package com.Spring.NewDanceApp.Security;

public enum UserPermission {
		READ("Read"),
		WRITE("Write");
	
		private String permission;

		private UserPermission(String permission) {
			this.permission = permission;
		}

		public String getPermission() {
			return permission;
		}

		
}
