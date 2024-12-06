package Org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShapeRendererTest {
	 private ShapeRenderer renderer;

	    @BeforeEach
	    public void setUp() {
	        renderer = new ShapeRenderer();
	    }

	    @Test
	    public void testRenderCircle() {
	        renderer.renderShape("circle");
	        // Assert output manually or use a custom output capture mechanism
	    }

	    @Test
	    public void testRenderRectangle() {
	        renderer.renderShape("rectangle");
	        // Assert output manually or use a custom output capture mechanism
	    }

	    @Test
	    public void testRenderTriangle() {
	        renderer.renderShape("triangle");
	        // Assert output manually or use a custom output capture mechanism
	    }

	    @Test
	    public void testRenderUnknownShape() {
	        renderer.renderShape("hexagon");
	        // Assert output manually or use a custom output capture mechanism
	    }
}
