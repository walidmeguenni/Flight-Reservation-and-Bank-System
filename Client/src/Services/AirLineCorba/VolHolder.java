package AirLineCorba;

/**
* AirLineCorba/VolHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Airline.idl
* Thursday, December 22, 2022 12:33:39 PM CET
*/

public final class VolHolder implements org.omg.CORBA.portable.Streamable
{
  public AirLineCorba.Vol value = null;

  public VolHolder ()
  {
  }

  public VolHolder (AirLineCorba.Vol initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AirLineCorba.VolHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AirLineCorba.VolHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AirLineCorba.VolHelper.type ();
  }

}
