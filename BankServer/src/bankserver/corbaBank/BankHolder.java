package corbaBank;

/**
* corbaBank/BankHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Sunday, December 11, 2022 8:58:38 PM CET
*/

public final class BankHolder implements org.omg.CORBA.portable.Streamable
{
  public corbaBank.Bank value = null;

  public BankHolder ()
  {
  }

  public BankHolder (corbaBank.Bank initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbaBank.BankHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbaBank.BankHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbaBank.BankHelper.type ();
  }

}
