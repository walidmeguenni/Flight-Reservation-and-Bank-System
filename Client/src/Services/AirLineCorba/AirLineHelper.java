package AirLineCorba;


/**
* AirLineCorba/AirLineHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Airline.idl
* Thursday, December 22, 2022 12:33:39 PM CET
*/

abstract public class AirLineHelper
{
  private static String  _id = "IDL:AirLineCorba/AirLine:1.0";

  public static void insert (org.omg.CORBA.Any a, AirLineCorba.AirLine that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AirLineCorba.AirLine extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AirLineCorba.AirLineHelper.id (), "AirLine");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AirLineCorba.AirLine read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AirLineStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AirLineCorba.AirLine value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AirLineCorba.AirLine narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AirLineCorba.AirLine)
      return (AirLineCorba.AirLine)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AirLineCorba._AirLineStub stub = new AirLineCorba._AirLineStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AirLineCorba.AirLine unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AirLineCorba.AirLine)
      return (AirLineCorba.AirLine)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AirLineCorba._AirLineStub stub = new AirLineCorba._AirLineStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}