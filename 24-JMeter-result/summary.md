
# (23) Understanding Jmeter Results
# SUMMARY
*Quick Analyze*

*Case 1*

- Response Time : Rendah (LOW)

- Throughput : Rendah (LOW)

- Conclude : Kasus ini tidak pernah terjadi.

*Case 2*

- Response Time : Rendah (LOW)

- Throughput : Tinggi (HIGH)

- Conclude : Ketika laporan menunjukkan bahwa waktu Respons rendah dan Throughput sangat tinggi. Itu berarti Server bekerja dengan sangat baik. Tes kinerja lulus atau Anda dapat mempertimbangkan untuk menambah beban dan terus mencari tahu batasan Server

*Case 3*

- Response Time : Tinggi (HIGH)

- Throughput : Rendah (LOW)

- Conclude : Ketika kami menemukan skenario di mana waktu Respons untuk permintaan tinggi tetapi Throughput jauh lebih rendah Ini menandakan bahwa Server tidak cukup mampu untuk mempertahankan/mengeksekusi permintaan. Yang meminta penyetelan di sisi server


*Case 4*

- Response Time : Tinggi (HIGH)

- Throughput : Tinggi (HIGH)

- Conclude : Ketika waktu Respon tinggi tetapi Throughput dibandingkan dengan Waktu respons jauh lebih tinggi Ini menyiratkan bahwa permintaan memakan waktu lebih lama karena kesalahan dalam aplikasi, mungkin skripnya tidak cukup baik. 
Kita tidak boleh menyalahkan waktu pemrosesan server untuk ini. 
Sekarang saatnya untuk mempertimbangkan faktor-faktor lain dan menyesuaikannya untuk membuat kinerja aplikasi lebih baik.

Normal Load = Kondisi suatu sistem ketika user akses sistem di angka yang biasanya
heavy load = Kondisi suatu sistem ketika user akses sistem dia angka yang meledak di saat waktu khusus(ada event tertentu)

# TASK


## Study case : SHOPEE 
1. Just Checking 
==> kapasitas user yang bisa ditampung saat mengakses fitur yang ada biasanya 
==> Conccurent user = per hourly visit X Average visit duration
Karena Pada data statistik yang tersedia hanya ada untuk monthly visit maka
penghitungan yang terjadi adalah :

* per Hourly Visit = 131,60 M / 30 Hari = 4,38
                     4,38 / 24 jam = 0,1827 
    
    
**lalu dikalikan  lagi terhadap average visitnya yang bernilai 6 menit 18 detik setara dengan 378 / 3600 (jam)= 0,1 jam sehingga hasilnya: Concurent user yang ada adalah :  0,019 M**


2. New Features added 

Contoh Fitur Feed di shopee( dianggap sbg fitur baru)

==> Kapasitas user yang bisa ditampung saat mengakses fitur yang baru ditambahkan ,sehingga dia bisa menggunakan target.

==> Target user per hourly visit = 8% diatas hourly visit normal karena(yang ada di just checking) = (0,1827*0,08) + 0,1827 = 0,197 M 

==> Average Visit duration = 9 menit = 0,125 jam 

==> Concurrent user =  target user * average user = 0,197 M * 0,125 = 0,02 M


**maka conccurent user yang ada adalah 0,24 M, alasannya mengapa fitur ini diatsa fitur just checking,karena merupakan fitur baru yang mampu membuat penasaran penggunanya,sehingga pengguna akan muncul lebih dari yang biasanya.**




# USUAL SPECIAL EVENT
==> Kapasitas user yang bisa ditampung ketika mengakses fitur yang biasanya ditujukan untuk suatu event khusus seperti 12.12(tanggal cantik)


==> Target User per hourly visit = 30 % diatas normal, maka = (0.3* 0,1827) + 0,1827 = 0,24 M


==> Average visit duration = 15 menit = 0,25 Jam


==> Concurrent User adalah = target user * average user = 0,24 *0,25 = 0,06 M 



# Quick Special Event

==>  Kapasitas user yang bisa ditampung ketika mengakses fitur yang biasanya ditujukan untuk suatu event khusus namun dengan durasi yang sebentar, misalnya flash sale


==> Target user per hourly visit = 70% diatas normal = (0.7 * 0,1827) + 0,1827 = 0,31 M

* Alasan penggunaan user 70 % diatas normal karena pada umumnya pengguna akan lebih tertarik dengan adanya event seperti flash sale ini
dikarenakan barang-barang lebih murah dan banyak yang diskon sehingga event seperti ini adalah event yang ditunggu oleh user dari produk e-commerce sehingga user pun pasti akan melonjak lebih banyak dari normal load**

==> Average visit duration = 18,5 menit = 0.3 Jam

==> Conccurent User adalah = target user * average user = 0.31 * 0.3 =  0,093 M


### Usage In E-Commerce :


1. Apa endpoint yang biasanya akan di lakukan testing :

Endpoint-endpoint yang biasa dilakukan test untuk dilihat performansi nya adalah endpoint-endpoint dari fitur yang utama dari sebuah produk itu yang dimana  fitur-fitur tersebut merupakan sumber utama tujuan dibangunnya produk e-commerce. Untuk e commerce biasanya yang menjadi fitur yang HARUS dilakukan testing adalah :

1. Endpoint Cart

2. Endpoint Login

3. Endpoint Halaman Product

4. Endpoint Pembayaran 

5. Endpoint Checkout

7. Endpoint Register


## Payment Gateway 
## OY!

1. Just Checking 

* Monthly Visit = 67,60 K 

Konversi ke Hourly Visit adalah : 

per Hourly Visit = 67,60 K / 30 Hari = 2,25
                     2,25 / 24 jam = 0,093
    
* Average visit User = 2 menit 20 detik = 140 /3600 =0,039


* Concurrent Usernya adalah : 

**per Hourly Visit * Average visit User** = 0,093*0,039 = 0,0036 K/Jam



2. New Features added 
* Per Hourly visit = 5 % diatas per hpurly visit untuk yang normal =  (0,093*0,05) + 0,093 = 0,097
    
* Average visit User = 3 menit 20 detik = 200 /3600 =0,05 Jam


* Concurrent Usernya adalah : 

**per Hourly Visit * Average visit User** = 0,097*0,05= 0,005 K/Jam


3. Usual Special Event

* Per Hourly visit = 15 % diatas per hourly visit untuk yang normal =  (0,093*0,15) + 0,093 = 0,1

**Alasan target user adalah 15% diatas per hourly visit, karena produk payment gateway lebih sedikit user yang bertambah dibandingkan ketika dengan e-commerce,karena ketika payment gateway hanya digunakan untuk transaksi**
    
* Average visit User = 1 menit = 60 /3600 =0,016 Jam

* Concurrent Usernya adalah : 

**per Hourly Visit * Average visit User** = 0,1*0,016= 0,017 K/Jam



4. Quick Special Event 


* Per Hourly visit = 20 % diatas per hourly visit untuk yang normal =  (0,093*0,20) + 0,093 = 0,1116

**Alasan target user adalah 20% diatas per hourly visit, karena produk payment gateway lebih sedikit user yang akan bertambah untuk menggunakan sistem dibandingkan ketika  dengan e-commerce,karena ketika payment gateway hanya digunakan untuk transaksi, namun kenapa dinaikkan lebih banyak dari Ussualy special event karena pasti ada beberapa user yang juga tertarik dengan quick event karena lebih murah dibanding ussually event**
    
* Average visit User = 1 menit = 60 /3600 =0,016 Jam

* Concurrent Usernya adalah : 

**per Hourly Visit * Average visit User** = 0,1116*0,016= 0,018 K/Jam




Endpoint Payment Gateway yang biasa dilakukan transaksi :

1. Endpoint Login

2. Endpoint Register

3. Endpoint transaksi ke bank 

4. Endpoint Top up 


5. 

## Aplikasi DANA

Alur Transaksi 

1. Login 

Masuk ke halaman login -Isi Pin - Masuk ke halaman Beranda

2. Registrasi

 Masuk ke halaman registrasi - isi form registrasi - Masuk ke halaman login -Isi Pin - Masuk ke halaman Beranda


3. Endpoint Taransaksi ke bank  

Login - pilih fitur transfer via bank - isi nama - pilih bank -isi nominal- isi keterangan - klik bayar 


4. Endpoint Top up pulsa 

Login - pilih fitur top up - masukkan nomor handphone - pilih pulsa yang ingin dibeli - klik bayar 





## Kendala yang muncul ketika performance test 

1. Salah dalam pemilihan tools untuk performance

2. Strategi yang digunakan tidak tepat ketika melakukan pengujian

3. Terbatasnya waktu serta anggaran yang dikeluarkan karena untuk melakukan performance testing biaya yang dibutuhkan sangat besar

4. Pemahaman yang kurang akan pentingnya performance test

5. Kesulitan dalam melakukan pengujian pada lingkungan produksi















