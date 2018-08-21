package shapes.interfaces;
import java.util.ArrayList;

import shapes.*;

public class GraphicTool implements Painter {
	
	ArrayList<Shape> queuedShapes;
	
	public GraphicTool() {
		this.queuedShapes = new ArrayList<Shape>();
	}
	
	/*
	 * What does this do?
	 * 
	 */
	public double printShapeInfo(Shape s) {
		if (s instanceof Rectangle) {
			((Rectangle) s).setHeight(10);
			((Rectangle) s).setWidth(2);
		}
		else if ( s instanceof Circle) {
			((Circle) s).setRadius(6);
		}
		return s.getArea();
	}
	
	@Override
	public void paint(Object o) {
		// Code for graphic tool to paint shapes
	}	
	
	@Override
	public String getPainterType() {
		return "GraphicTool";
	}
	
	/*
	 * Prints all shapes in our list!
	 * TODO
	 */
	public void printAll() {
		for (Shape s : this.queuedShapes) {
			System.out.println("This shape has color " 
						+ s.getColor() + " and area " + s.getArea());
		}
	}
	
	public static void main(String[] args) {
		// It me
		GraphicTool tool = new GraphicTool();
		
		// Some shapes
		Rectangle redRect = new Rectangle("red");
		Shape blueCirc = new Circle("blue");
		Shape greenSquare = new Square("green");
		
		redRect.setHeight(10);
		redRect.setWidth(20);
		
		tool.queuedShapes.add(redRect);
		tool.queuedShapes.add(blueCirc);
		tool.queuedShapes.add(greenSquare);
		
		tool.printAll();

	}

}
