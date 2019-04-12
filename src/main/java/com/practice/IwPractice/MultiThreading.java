package com.practice.IwPractice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreading {

	public static void main(String[] args) {
		Thread[] t = new Thread[2];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(new MultiThreading().new consumer());
		}

		for (int i = 0; i < t.length; i++) {
			t[i].start();
		}

	}

	public class consumer implements Runnable {

		public synchronized void print1() {
			/*
			 * int i = 0; System.out.println(":"+Thread.currentThread()+" "+i++);
			 */
			for (int i = 0; i <= 5; i++) {
				/*
				 * try { Thread.sleep(0); } catch (InterruptedException e) {
				 * e.printStackTrace(); }
				 */
				System.out.println(":" + Thread.currentThread() + " " + i);
				// System.out.print(": "+i);
			}
		}

		public synchronized void print2() {
			/*
			 * int i = 0; System.out.println(":"+Thread.currentThread()+" "+i++);
			 */

			for (int i = 0; i <= 5; i++) {
				/*
				 * try { Thread.sleep(0); } catch (InterruptedException e) {
				 * e.printStackTrace(); }
				 */
				System.out.println(":" + Thread.currentThread() + " " + i);
				// System.out.print(": "+i);
			}
		}

		public void run() {
			new consumer().print1();
		}

	}

}
