package corbaBank;


/**
* corbaBank/BankOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Bank.idl
* Sunday, December 11, 2022 9:26:05 PM CET
*/

public interface BankOperations 
{
  boolean Transaction (String email, int ccp, double balance);
} // interface BankOperations