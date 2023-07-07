package corbaBank;


/**
* corbaBank/Account.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Sunday, December 11, 2022 9:26:05 PM CET
*/

public final class Account implements org.omg.CORBA.portable.IDLEntity
{
  public int accountId = (int)0;
  public String email = null;
  public int cpp = (int)0;
  public double balance = (double)0;
  public String role = null;

  public Account ()
  {
  } // ctor

  public Account (int _accountId, String _email, int _cpp, double _balance, String _role)
  {
    accountId = _accountId;
    email = _email;
    cpp = _cpp;
    balance = _balance;
    role = _role;
  } // ctor

} // class Account