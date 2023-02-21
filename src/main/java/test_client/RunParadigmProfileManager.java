/*******************************************************************************
 * IT4Innovations - National Supercomputing Center
 * Copyright (c) 2017 - 2023 All Right Reserved, https://www.it4i.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE', which is part of this project.
 ******************************************************************************/
package test_client;

import net.imagej.ImageJ;

import cz.it4i.command.ParadigmProfilesManager;
public class RunParadigmProfileManager {

	public static void main(final String... args) {
		// Launch ImageJ as usual.
		final ImageJ ij = new ImageJ();
		ij.launch(args);
		ij.command().run(ParadigmProfilesManager.class, true);
	}

}
