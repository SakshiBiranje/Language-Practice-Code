import java.util.Scanner;

class oddSum {
   oddSum() {
   }

   public static void sum(int var0) {
      int var1 = 0;

      for(int var2 = 1; var2 <= var0; ++var2) {
         if (var2 % 2 != 0) {
            var1 += var2;
         }
      }

      System.out.print(var1);
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter n : ");
      int var2 = var1.nextInt();
      sum(var2);
   }
}
