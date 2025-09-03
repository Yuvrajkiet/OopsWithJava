package ct1;
interface Cancellable {
    void cancel(int refund);
}
// ab no cancel ko implement karega vo yeh use karega


abstract class Booking implements Cancellable {
    String bookingId;
    int amount;

    Booking(String bookingId, int amount) {
        this.bookingId = bookingId;
        this.amount = amount;
    }

    void showDetails() {
        System.out.println("Booking created" + bookingId + ", Amount= " + amount);
    }

    
    abstract void confirm();

    
    public void cancel(int refund) {
        System.out.println(bookingId + " cancelled. Refund given: " + refund);
    }
}
// booking class jo parent class banegi baaki classes ke liye jisme saare important chize hai (abstract) and cacnellable implemented hai 


class CabBooking extends Booking {
    CabBooking(String bookingId, int amount) {
        super(bookingId, amount);
    }

    void schedule(String time) {
        System.out.println(bookingId + " scheduled at " + time);
    }

    void confirm() {
        System.out.println(bookingId + " confirmed");
    }
}


class TrainBooking extends Booking {
    TrainBooking(String bookingId, int amount) {
        super(bookingId, amount);
    }

    void confirm() {
        System.out.println(bookingId + " confirmed");
    }
}


class BusBooking extends Booking {
    BusBooking(String bookingId, int amount) {
        super(bookingId, amount);
    }

    void confirm() {
        System.out.println(bookingId + " confirmed");
    }
}


public class BookingDemo {
    public static void main(String[] args) {
        try {
            
            CabBooking cab = new CabBooking("CAB101", 500);
            cab.showDetails();
            cab.schedule("10:00am");
            cab.cancel(200);

            System.out.println();

            
            TrainBooking train = new TrainBooking("TRN202", 1200);
            train.showDetails();
            train.confirm();
            train.cancel(1500);  

            System.out.println();


            BusBooking bus = new BusBooking("BUS303", 200);
            bus.showDetails();
            bus.confirm();

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
