package AirLineCorba;

/**
* AirLineCorba/ConnectHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Airline.idl
* Thursday, December 22, 2022 12:35:23 PM CET
*/

public final class ConnectHolder implements org.omg.CORBA.portable.Streamable
{
  public AirLineCorba.Connect value = null;

  public ConnectHolder ()
  {
  }

  public ConnectHolder (AirLineCorba.Connect initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AirLineCorba.ConnectHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AirLineCorba.ConnectHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AirLineCorba.ConnectHelper.type ();
  }

}
