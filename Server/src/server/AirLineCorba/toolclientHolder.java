package AirLineCorba;


/**
* AirLineCorba/toolclientHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Airline.idl
* Thursday, December 22, 2022 12:35:23 PM CET
*/

public final class toolclientHolder implements org.omg.CORBA.portable.Streamable
{
  public AirLineCorba.Client value[] = null;

  public toolclientHolder ()
  {
  }

  public toolclientHolder (AirLineCorba.Client[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AirLineCorba.toolclientHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AirLineCorba.toolclientHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AirLineCorba.toolclientHelper.type ();
  }

}
