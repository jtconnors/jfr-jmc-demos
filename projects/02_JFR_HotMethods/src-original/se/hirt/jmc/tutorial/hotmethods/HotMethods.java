/*
 * Copyright (c) 2018, Marcus Hirt
 * 
 * jmc-tutorial is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jmc-tutorial is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jmc-tutorial. If not, see <http://www.gnu.org/licenses/>.
 */
package se.hirt.jmc.tutorial.hotmethods;

import java.io.IOException;

/**
 * Never mind this class. These are not the droi... This is not the class you're looking for. It's
 * just for setting up the worker threads. The problem is elsewhere. ;)
 */
public class HotMethods {
	// Hint: You may want to set NUMBER_OF_THREADS close to the number of hardware threads for maximum saturation
	private static final int NUMBER_OF_THREADS = 4;

	public static void main(String[] args) throws IOException {
		ThreadGroup threadGroup = new ThreadGroup("Workers");
		Thread[] threads = new Thread[NUMBER_OF_THREADS];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(threadGroup, new Worker(), "Worker Thread " + i);
			threads[i].setDaemon(true);
			threads[i].start();
		}
		System.out.print("Press enter to quit!");
		System.out.flush();
		System.in.read();
	}

}
