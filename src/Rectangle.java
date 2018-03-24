import java.awt.Graphics;
import java.awt.Shape;
import java.util.ArrayList;

public class Rectangle extends CompositeShapes {

	ArrayList<Shape> lines;

	public Rectangle() {
		lines = new ArrayList<Shape>();
	}

	@Override
	public void draw(Graphics g) {
		for (int i = 0; i < lines.size(); i++) {
			((Rectangle) lines.get(i)).draw(g);
		}

	}

	@Override
	public void AddChild(Shape sh) {
		lines.add(sh);

	}

}
