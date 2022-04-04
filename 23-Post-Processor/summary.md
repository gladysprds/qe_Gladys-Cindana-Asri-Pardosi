# Nama : Gladys Cindana Pardosi
# Kelas : B_QE


**Post Processor**
==> Merupakan aksi yang berjalan ketika proses setelah dilakukan,proses request ke suatu alamat web. Pada umumnya, mengekstrak
value yang didapatkan dari hasil mengakases halaman sebuah web. Post processor yang bisa digunakan di JMeter adalah **Json Extractor**

**JSON Extractor**
Pada JSon Extractor kita dapat menggunakan Json Path untuk mengambil nilai yang terdapat dari data json yang dihasilkan dari respons saat kita melakukan request. 

**JSON Path**

1. Digunakan Untuk extract isi dari JSON Response
2. Beberapa ekspresi yang umum digunakan :
 * $ = Root Element
 * . = Child Operator
 * []= child operator array
 * .. = recursive descent(langsung ke objek)
 * * =wildcard(all things)
 *[ start:end ] = array slice operator borrowed 
