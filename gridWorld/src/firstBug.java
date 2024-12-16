import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class firstBug {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		meBug dug = new meBug();
		dug.setColor(Color.YELLOW);
		world.add(new Location(0,0), dug);
		world.show();
		
	}

}
