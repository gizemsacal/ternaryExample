public class Main {

    public static void main(String[] args) {
	/*Ternary operatörü; basitleştirilmiş bir if-else koşulu çalışır.
	doğru veya yanlış olarak değerlendirilen bir koşulun yanı sıra
	koşul doğruysa döndürülen bir değer ve koşul yanlışsa döndürülen başka bir değerden
	oluşur. kısaca kendisi if else'nin kısayolu gibidir.
   */
/*Ternary operatörü Formatı ;İlk kısım, bir boolean veya boolean döndüren bir methodun
 sonucu olmak zorunda. Boolean true ise soru işaretinden sonraki ilk kısım döndürülecek,
  false ise de ikinci kısım döndürülecektir.
 */
        //Ternary operatörsüz kod örneği:

        final int num = 8;
        String msg = null;

        if (num > 10) {
            msg = "Sayı 10'dan yüksek";
        }else{
            msg = "Sayı 10 veya daha düşük bir sayı";
        }
        System.out.println(msg);
       //Ternary operatörlü kod örneği:
        final int number = 8;
        final String massage = number > 10 ? "Sayı 10'dan yüksek" : "Sayı 10 veya daha düşük bir sayı";

    }

}


