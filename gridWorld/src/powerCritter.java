import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class powerCritter extends Bug{
	private int hp = 50;
	public void act() {
		while(hp>0) {
			if(canMove()){
				move();
			}else {
				turn();
			}
			System.out.print(hp);
		}
	}
	public void move() {
		Grid<Actor> gr = getGrid();
		 if (gr == null)
			 return;
		 Location loc = getLocation();
		 Location next = loc.getAdjacentLocation(getDirection());
		 if (gr.isValid(next)) {
			 moveTo(next);
		 } else {
			 removeSelfFromGrid();
		 }
		 hp =- 1;
	}
 }
