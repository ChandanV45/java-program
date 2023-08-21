package com.xworkz.app;

	public abstract class Project {

		public abstract void start();

		public abstract void implement();

		public abstract void test();

		public abstract void review();

		public abstract void complete();

		public void display() {

			System.out.println("Project Display ");
		}

		public void collection() {
			System.out.println("Project is being prioritized.");
		}

		public void Meeting() {
			System.out.println("A meeting for project  has been scheduled.");
		}

		public void updateStatus() {
			System.out.println("Project  status updated: ");
		}

		public void finalmeeting() {
			System.out.println("Project  has been successfully completed. Time to celebrate!");
		}
	}

