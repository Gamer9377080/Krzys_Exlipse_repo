public class Reservation {

   private String guestName;
   private int roomNumber;

   public Reservation(String name, int r) {
       guestName = name;
       roomNumber = r;
   }

   public String getGuestName() {
       return guestName;
   }

   public void setGuestName(String guestName) {
       this.guestName = guestName;
   }

   public void setRoomNumber(int roomNumber) {
       this.roomNumber = roomNumber;
   }

   public int getRoomNumber() {
       return roomNumber;
   }
}