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
package se.hirt.jmc.tutorial.donothing;

import java.io.IOException;

/**
 * Program that doesn't do much.
 */
public class DoNothing {
	public static void main(String[] args) throws IOException {
		System.out.println("Press <enter> to quit!");
		System.in.read();
	}
}
