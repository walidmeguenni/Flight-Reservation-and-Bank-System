package corbaBank;

/**
* corbaBank/AccountHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Sunday, December 11, 2022 9:26:05 PM CET
*/

public final class AccountHolder implements org.omg.CORBA.portable.Streamable
{
  public corbaBank.Account value = null;

  public AccountHolder ()
  {
  }

  public AccountHolder (corbaBank.Account initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbaBank.AccountHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbaBank.AccountHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbaBank.AccountHelper.type ();
  }

}
