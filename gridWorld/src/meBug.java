import java.awt.Color;
import java.awt.GridBagConstraints;
import info.gridworld.*;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class meBug extends Bug{
	private Color color;
	public meBug(Color c) {
		super(c);
	}
	/*public void act() {
		if(canMove()){
			move();
		}else {
			turn();
		}
	}*/
	
	public void move() {
		Grid<Actor> gr = getGrid();
		 if (gr == null)
			 return;
		 Location loc = getLocation();
		 Location next = loc.getAdjacentLocation(getDirection());
		 if (gr.isValid(next))
			 moveTo(next);
		 else
			 removeSelfFromGrid();
	}
}
