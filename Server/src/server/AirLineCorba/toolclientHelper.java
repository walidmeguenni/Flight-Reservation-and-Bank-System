package AirLineCorba;


/**
* AirLineCorba/toolclientHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Airline.idl
* Thursday, December 22, 2022 12:35:23 PM CET
*/

abstract public class toolclientHelper
{
  private static String  _id = "IDL:AirLineCorba/toolclient:1.0";

  public static void insert (org.omg.CORBA.Any a, AirLineCorba.Client[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AirLineCorba.Client[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = AirLineCorba.ClientHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (AirLineCorba.toolclientHelper.id (), "toolclient", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AirLineCorba.Client[] read (org.omg.CORBA.portable.InputStream istream)
  {
    AirLineCorba.Client value[] = null;
    int _len0 = istream.read_long ();
    value = new AirLineCorba.Client[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = AirLineCorba.ClientHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AirLineCorba.Client[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      AirLineCorba.ClientHelper.write (ostream, value[_i0]);
  }

}
