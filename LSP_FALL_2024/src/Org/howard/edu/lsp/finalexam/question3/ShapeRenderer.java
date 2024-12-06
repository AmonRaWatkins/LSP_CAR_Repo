package Org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {
	 private ShapeFactory shapeFactory;

	    public ShapeRenderer() {
	        this.shapeFactory = ShapeFactory.getInstance();
	    }

	    public void renderShape(String shapeType) {
	        Shape shape = shapeFactory.createShape(shapeType);
	        if (shape != null) {
	            shape.draw();
	        } else {
	            System.out.println("Unknown shape type: " + shapeType);
	        }
	    }
}
