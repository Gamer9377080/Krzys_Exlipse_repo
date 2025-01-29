import java.util.ArrayList;

public class Hotel {

   private Reservation[] rooms;
   private ArrayList<String> waitList;
   
   //int[] data = new int[5]
   public Hotel(int r) {
       rooms = new Reservation[r];
       waitList = new ArrayList<String>();
   }
   
   public Reservation requestRoom(String guestName) {
       
       for(int i=0; i<rooms.length; i++) {
           if(rooms[i]==null) {
               rooms[i]= new Reservation(guestName,i);
               return rooms[i];
           }
       }
       waitList.add(guestName);
       return null;
       
   }
   public Reservation cancelAndReassign(Reservation res) {
	   int roomNum = res.getRoomNumber();
	   if(waitList.isEmpty()) {
		   rooms[roomNum]=null;
	   }else {
		   rooms[roomNum]=new Reservation((String)waitList.get(0), roomNum);
		   waitList.remove(0);
	   }
	   return rooms[roomNum];
   }
    public Reservation[] getReservations() {
        return rooms;
    
    }
    public void printWaitList() {
        for(int w = 0; w<waitList.size(); w++) {
            System.out.print(waitList.get(w)+" ");
        }
    }
}
	