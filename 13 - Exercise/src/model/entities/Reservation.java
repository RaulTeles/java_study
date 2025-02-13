package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int rommNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){
    }

    public Reservation(int rommNumber, Date checkIn, Date checkout) throws DomainException{

        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after chek-in date");
        }
        this.rommNumber = rommNumber;
        this.checkIn = checkIn;
        this.checkOut = checkout;
    }

    public int getRommNumber() {
        return rommNumber;
    }

    public void setRommNumber(int rommNumber) {
        this.rommNumber = rommNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

//    implementando diferença entre datas
    public long duration(){
        long diff = checkOut.getTime() - checkOut.getTime();
//        convertendo milisegundos em dias
        return TimeUnit.DAYS.convert(diff,TimeUnit.MICROSECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be furure dates");
        }
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after chek-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room"
                + rommNumber
                + ", checkin: "
                + sdf.format(checkIn)
                + ", checkout: "
                + sdf.format(checkOut)
                +", "
                +duration()
                +" nights";
    }
}