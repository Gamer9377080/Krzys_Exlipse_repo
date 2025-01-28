import java.util.ArrayList;

public class Trip {
	private ArrayList<Flights> flights;

	public Trip(ArrayList<Flights> f) {
		this.flights = f;
	}

	public int getDuration() {

		if (flights.size() == 0) {
			return 0;
		} else {
			Time start = flights.get(0).getDeparturetime();
			Time end = flights.get(flights.size() - 1).GetArrialTime();
			return start.minutesUntil(end);
		}
	}

	public int getShortestlayover() {
		if (flights.size() < 2) {
			return -1;
		} else {
			int shortest = getDuration();
			for (int i = 0; i < flights.size() - 1; i++) {
				Time arrive = flights.get(i).GetArrialTime();
				Time leave = flights.get(i + 1).getDeparturetime();
				int layover = arrive.minutesUntil(leave);
				if (layover < shortest) {
					shortest = layover;
				}
			}
			return shortest;
		}
	}
}
