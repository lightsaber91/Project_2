/**
 *Legge input da tastiera e li converte nel formato scelto
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Read
{
	/*
	 * legge una stringa da tastiera
	 */
   public static String readString()
   {
      br = new BufferedReader(new InputStreamReader(System.in));

      try
      {
         _String = br.readLine();
      }
      catch (IOException e)
      {
         System.out.println ("errore di flusso");
      }

      return(_String);
   }
	/*
	 * Legge un intero da tastiera
	 */
   public static int readInt()
   {
      br = new BufferedReader(new InputStreamReader(System.in));

      try
      {
         _String = br.readLine();
         _int = Integer.parseInt(_String);
      }
      catch (IOException e1)
      {
         System.out.println ("errore di flusso");
      }
      catch (NumberFormatException e2)
      {
         System.out.println ("errore di input da tastiera");
         return(0);
      }

      return(_int);
   }
	/*
	 * Legge un carrattere da tastiera
	 */
   public static char readChar()
   {
      br = new BufferedReader(new InputStreamReader(System.in));

      try
      {
         _String = br.readLine();

         if (_String.length() > 1)
            throw new NumberFormatException();

         _char = _String.charAt(0);
      }
      catch (IOException e1)
      {
         System.out.println ("errore di flusso");
      }
      catch (NumberFormatException e2)
      {
         System.out.println ("errore di input da tastiera");
         return(0);
      }

      return(_char);
   }
	/*
	 * Legge un float da tastiera
	 */
   public static float readFloat()
   {
      br = new BufferedReader(new InputStreamReader(System.in));

      try
      {
         _String = br.readLine();
         _float = Float.parseFloat(_String);
      }
      catch (IOException e1)
      {
         System.out.println ("errore di flusso");
      }
      catch (NumberFormatException e2)
      {
         System.out.println ("errore di input da tastiera");
         return(0);
      }

      return(_float);
   }
	/*
	 * Legge un double da tastiera
	 */
   public static double readDouble()
   {
      br = new BufferedReader(new InputStreamReader(System.in));

      try
      {
         _String = br.readLine();
         _double = Double.parseDouble(_String);
      }
      catch (IOException e1)
      {
         System.out.println ("errore di flusso");
      }
      catch (NumberFormatException e2)
      {
         System.out.println ("errore di input da tastiera");
         return(0);
      }

      return(_double);
   }

   private static BufferedReader br;

   private static String _String;
   private static int _int;
   private static char _char;
   private static float _float;
   private static double _double;
}