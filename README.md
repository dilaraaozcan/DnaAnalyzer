# 🧬 DNA Analyzer — MIT Style Sequence Validation (Java)

Bu proje, MIT tarzı problem setlerinden ve hesaplamalı biyoloji (computational biology) yaklaşımından ilham alınarak hazırlanmış bir DNA dizisi analiz uygulamasıdır. Program, kullanıcıdan alınan DNA dizisini karakter seviyesinde inceleyerek doğrulama ve analiz işlemleri gerçekleştirir.

---

## 🎯 Projenin Amacı

- DNA dizisinin yalnızca geçerli bazlardan (A, C, G, T) oluşup oluşmadığını kontrol etmek
- Geçersiz bir karakter varsa ilk hatayı ve indeksini raporlamak
- Geçerli bir DNA dizisi için detaylı analiz raporu üretmek
- Algoritmik düşünme, döngü ve karakter işleme pratiği kazanmak

---

## 🧠 Program Neler Yapar?

- Kullanıcıdan bir DNA dizisi alır
- Küçük harfleri otomatik olarak büyük harfe çevirir
- DNA dizisini karakter karakter tarar (charAt)
- A, C, G ve T bazlarını ayrı ayrı sayar
- İlk geçersiz karakteri ve indeksini tespit eder
- DNA geçerliyse:
  - Toplam uzunluğu hesaplar
  - Her bazın sayısını yazdırır
  - En fazla görülen bazı bulur
  - GC içeriği yüzdesini hesaplar

---

## 🧪 DNA Doğrulama Kuralları

Geçerli bir DNA dizisi yalnızca aşağıdaki karakterleri içerebilir:

- A
- C
- G
- T

Bu karakterler dışındaki herhangi bir giriş DNA’yı geçersiz kılar.

---

## 📌 Örnek Kullanım

Geçerli DNA girdisi:
AACGTAGT

Program çıktısı:
DNA dizisi geçerlidir.
Toplam uzunluk: 8
A sayısı: 3
C sayısı: 1
G sayısı: 2
T sayısı: 2
En fazla görülen baz: A (3 adet)
GC içeriği: %37.50

Geçersiz DNA girdisi:
AACXGT

Program çıktısı:
Geçersiz DNA dizisi.
Geçersiz karakter: X
Hata indeksi: 3

---

## 📁 Proje Yapısı

DNA-Analyzer/
└── src/
    └── Main.java

---

## ▶️ Çalıştırma

Bu proje IntelliJ IDEA veya herhangi bir Java IDE kullanılarak Main.java dosyası üzerinden çalıştırılabilir. Ek kütüphane veya harici bağımlılık gerektirmez.

---

Bu proje, Java dilinde karakter tabanlı analiz, döngü kullanımı, koşul yapıları ve veri doğrulama mantığını öğrenmek isteyenler için akademik ve öğretici bir örnek sunar.
