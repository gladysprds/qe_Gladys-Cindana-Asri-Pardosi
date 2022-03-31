## Nama : Gladys Pardosi
## Kelas : QE_B
## Resume

### Arsitektur Serenity BDD

- Serenity adalah Kerangka BDD open source yang membantu membuat tes penerimaan otomatis yang terstruktur dengan baik dan dapat dipelihara.

- Arsitektur Serenity terdiri dari Requirement, Tests, Steps, Pages, dan Reports.


 ### Tentukan Persyaratan

- Saat menggunakan Serenity, Anda mulai dengan persyaratan yang perlu Anda terapkan.

- Ini sering dinyatakan sebagai "cerita" pengguna dengan kriteria penerimaan yang membantu memperjelas persyaratan.

- "Cerita" inilah yang diotomatiskan Serenity.


 ### Otomatiskan Kriteria Penerimaan

- Selanjutnya, jelaskan penerimaannya kriteria dalam istilah bisnis tingkat tinggi.

- Catat kriteria penerimaan ini menggunakan alat BDD seperti Mentimun dengan formulir "fitur", sehingga Serenity dapat menjalankannya.


 ### Penerapan  Tes

- Menerapkan kriteria penerimaan ke dalam kode, sehingga dapat berjalan melawan aplikasi yang sebenarnya.

- Di bawah tenda, pengujian dipecah menjadi langkah-langkah bersarang untuk keterbacaan yang lebih baik dan perawatan yang lebih mudah

Laporan Hasil Tes

- Serenity memberikan laporan rinci tentang hasil tes dan eksekusi, termasuk:

Sebuah narasi untuk setiap tes

- Tangkapan layar untuk setiap langkah dalam ujian

- Hasil tes termasuk waktu eksekusi dan pesan kesalahan jika tes gagal


The Step Overview

- Tulis Cerita

Sintaks Gherkin (Diberikan, Kapan, Kemudian)

- Konfigurasikan Cerita

Konfigurasikan cerita dan langkah

- Interaksi Peramban

Petakan langkah-langkah untuk manipulasi browser

- Jalankan Cerita

ide cerdas, maven

- Lihat Laporan

Buat laporan menggunakan Serenity


Practice Scenario

1. Tulis Cerita Tes

• Buat cerita file di direktori root sumber daya pengujian

• Fitur terdiri dari 3 bagian: Skenario Fitur, Skenario, dan Sintaks Gherkin (Diberikan, Kapan, Lalu)

• Sintaks fitur harus seperti pada gambar berikut


2. Buat Kelas Tes

• Buat kelas uji dalam uji paket/java

• Setiap diberikan, kapan dan kemudian dalam cerita file harus diwakili hanya dalam 1 fungsi

• Fungsi dijelaskan dengan sintaks gherkin yang sesuai

3. Buat Langkah Tes

• Buat kelas langkah yang memperluas kelas ScenarioSteps

Nama kelas harus diakhiri dengan "Langkah" untuk kemudahan perawatan

• Di kelas ini, langkah-langkah harus memanggil fungsi yang terletak di kelas PageObject

4. Buat Objek Halaman

• Buat kelas yang memperluas PageObject

• Kelas ini terdiri dari fungsi yang mencari dan mengoperasikan elemen situs web

• Tidak ada batasan tentang cara menemukan elemen (id, xpath, class, dll)

5. Jalankan tes

• Jalankan tes dengan perintah mvn verifikasi

• Itu harus mencetak semua logging di konsol dan kesalahan apa pun jika ada

• Setelah uji coba, laporan akan dibuat secara otomatis dan ditempatkan secara default di jalur /target/situs/serenity