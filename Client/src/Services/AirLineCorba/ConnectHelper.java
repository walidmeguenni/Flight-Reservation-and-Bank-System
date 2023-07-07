package AirLineCorba;


/**
* AirLineCorba/ConnectHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Airline.idl
* Thursday, December 22, 2022 12:33:39 PM CET
*/

abstract public class ConnectHelper
{
  private static String  _id = "IDL:AirLineCorba/Connect:1.0";

  public static void insert (org.omg.CORBA.Any a, AirLineCorba.Connect that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AirLineCorba.Connect extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _members0[0] = new org.omg.CORBA.StructMember (
            "status",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "clientId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "role",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (AirLineCorba.ConnectHelper.id (), "Connect", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AirLineCorba.Connect read (org.omg.CORBA.portable.InputStream istream)
  {
    AirLineCorba.Connect value = new AirLineCorba.Connect ();
    value.status = istream.read_boolean ();
    value.clientId = istream.read_string ();
    value.role = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AirLineCorba.Connect value)
  {
    ostream.write_boolean (value.status);
    ostream.write_string (value.clientId);
    ostream.write_string (value.role);
  }

}
