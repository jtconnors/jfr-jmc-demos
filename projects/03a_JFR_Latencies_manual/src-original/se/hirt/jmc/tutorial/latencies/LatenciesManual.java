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
package se.hirt.jmc.tutorial.latencies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class used to run the latency problem example.
 */
public class LatenciesManual {
	
	public static void main(String[] args) throws InterruptedException, IOException {		
		ThreadGroup threadGroup = new ThreadGroup("Workers");
		Thread.sleep(2000);
		Thread[] threads;
		threads = new Thread[20];
		
		threads[0] = new Thread(threadGroup, new Worker(0, 30_000_000), "Worker Thread " + 0);
		threads[0].setDaemon(true);
		System.out.println("Starting " + threads[0].getName() + "...");
		threads[0].start();
		
		System.out.println("Press <enter> to begin additional thread allocation and startup");
		System.out.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
			
		for (int i = 01; i < threads.length; i++) {
			threads[i] = new Thread(threadGroup, new Worker(i, 30_000_000), "Worker Thread " + i);
			threads[i].setDaemon(true);
			Thread.sleep(3000);;
			System.out.println("Starting " + threads[i].getName() + "...");
			threads[i].start();
		}
		
		System.out.println("...all prepared!");
		System.out.println("Press <enter> to quit!");
		System.out.flush();
		br.readLine();
		System.out.println("Program ended.");
		System.out.flush();
	}
}
