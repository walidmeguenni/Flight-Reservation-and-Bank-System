package AirLineCorba;


/**
* AirLineCorba/Vol.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Airline.idl
* Thursday, December 22, 2022 12:35:23 PM CET
*/

public final class Vol implements org.omg.CORBA.portable.IDLEntity
{
  public int volId = (int)0;
  public String airport = null;
  public String destination = null;
  public String takeDate = null;
  public double totalTicktite = (double)0;
  public double price = (double)0;

  public Vol ()
  {
  } // ctor

  public Vol (int _volId, String _airport, String _destination, String _takeDate, double _totalTicktite, double _price)
  {
    volId = _volId;
    airport = _airport;
    destination = _destination;
    takeDate = _takeDate;
    totalTicktite = _totalTicktite;
    price = _price;
  } // ctor

} // class Vol
