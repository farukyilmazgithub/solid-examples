/*
SOLID yazılım prensipleri; geliştirilen yazılımın esnek, yeniden kullanılabilir, sürdürülebilir ve anlaşılır olmasını sağlayan ve kod tekrarını önleyen prensiplerdir.
Kodun esnek, sürdürülebilir ve geliştirilebilir tasarlanmaması kodu kırılganlaştırır ve yazılım ürününün gelişmesini etkiler.
SOLID 5 farklı prensipten oluşur ve her birini baş harfini alır. SOLID prensipleri kısaca şu şekildedir:
    	Single-responsibility principle:
        - Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, o da o sınıfa yüklenen sorumluluktur. Bir sınıfın(ya da fonksiyonun) yapması gereken yalnızca bir işi olması gerekir.
    	Open-closed principle:
        - Bir sınıf ya da fonksiyon hâlihazırda var olan özellikleri korumalı ve değişikliğe izin vermemelidir. Davranışını değiştirmiyor ve yeni özellikler kazanabiliyor olmalıdır.
    	Liskov substitution principle:
        - Kodlarda herhangi bir değişiklik yapmaya gerek duymadan alt sınıflar, türedikleri(üst) sınıfların yerine kullanılabilmelidir.
    	Interface segregation principle:
        - Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturulmalıdır.
    	Dependency Inversion Principle:
        - Sınıflar arası bağımlılıklar olabildiğince az olmalıdır, özellikle üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("SOLID");
    }
}