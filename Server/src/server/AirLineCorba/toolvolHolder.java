package AirLineCorba;


/**
* AirLineCorba/toolvolHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Airline.idl
* Thursday, December 22, 2022 12:35:23 PM CET
*/

public final class toolvolHolder implements org.omg.CORBA.portable.Streamable
{
  public AirLineCorba.Vol value[] = null;

  public toolvolHolder ()
  {
  }

  public toolvolHolder (AirLineCorba.Vol[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AirLineCorba.toolvolHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AirLineCorba.toolvolHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AirLineCorba.toolvolHelper.type ();
  }

}
