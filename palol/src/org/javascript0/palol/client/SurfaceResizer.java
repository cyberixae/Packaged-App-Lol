package org.javascript0.palol.client;

import gwt.g3d.client.Surface3D;

import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;

public class SurfaceResizer implements ResizeHandler {

	private Surface3D surface;
	
	public SurfaceResizer(Surface3D surface){
		this.surface = surface;
	}
	
	@Override
	public void onResize(ResizeEvent event) {
		this.surface.setSize(event.getWidth(), event.getHeight());
	}

}
