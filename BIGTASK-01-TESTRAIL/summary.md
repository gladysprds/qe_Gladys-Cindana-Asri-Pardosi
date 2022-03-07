## Nama : Gladys C A Pardosi
## Kelas : B_QE


# PORTAL BERITA DETIK.COM

Pada Pengujian kali ini dilakukan terhadap Portal Berita Online yaitu Detik.com. Terdapat 3 Halaman yang diuji yaitu Registrasi, Login dan halaman Edukasi. Masing-masing Halaman akan dibatasi minimal 3 Test Case dan akan dimasukkan ke dalam Test Case Management Tools yaitu Test Rail. Terdapat 10 Test Case yang diuji dengan persentase status passed sebesar 100% karena memang belum ada bug yang ditemukan dari test case yang diambil. Berikut ini gambaran dari Test Run Portal Berita Online Detik.com:





![TestRun](./Screenshot/Test-Case-Detik/Testrun.PNG)





Milestone merupakan sebuah tolak ukur waktu yang harus tepati oleh tim mengenai jangka waktu yang digunakan untuk membangun fitur-fitur yang akan dikerjakan. Pada Pengujian kali ini diberikan Milestone01 yang memiliki jangka waktu selama 1 Minggu,Berikut Ini merupakan milestone dari Detik.com yang sudah di-complete-kan karena telah selesai :



![Milestone](./Screenshot/Test-Case-Detik/milestone.PNG)



* **Halaman Registrasi**
![Halaman Registrasi](./Screenshot/Test-Case-Detik/Registrasi/Test-scenario-Registrasi.PNG)








* **Halaman Login**
![Halaman Login](./Screenshot/Test-Case-Detik/Login/Tes-scenario-Login.PNG)






* **Halaman Edukasi**
![Halaman Edukasi](./Screenshot/Test-Case-Detik/Edukasi/Test-scenario-edukasi.PNG)




# ------------ TEST CASE -----------------



*Registrasi*


* User berhasil Registrasi dengan mengisi semua Field Registrasi sesuai Requirement



![Halaman Registrasi](./Screenshot/Test-Case-Detik/Registrasi/mengisi-semua-field.PNG)


* User Gagal Registrasi dengan password yang kurang dari 8 Karakter dan Bukan merupakan kombinasi huruf-angka




![Halaman Registrasi-2](./Screenshot/Test-Case-Detik/Registrasi/kurang-dari-8-karakter.PNG)



* User Gagal Registrasi dengan nomor telepon yang telah terdaftar sebelumnya





![Halaman Registrasi-3](./Screenshot/Test-Case-Detik/Registrasi/nomor-telepon-terdaftar-sebelumnya.PNG)




* User Gagal Registrasi ketika menginput nomor telepon >14 karakter




![Halaman Registrasi-4](./Screenshot/Test-Case-Detik/Registrasi/nomor-telepon-lebih-dari-14.PNG)




-----------------------------------------------------------------

*Login*

* User berhasil Login ketika mengisi semua field dengan benar



![Halaman Login-1](./Screenshot/Test-Case-Detik/Login/semua-field-benar.PNG)




* User Gagal login karena username valid tetapi password invalid




![Halaman Login-2](./Screenshot/Test-Case-Detik/Login/username-valid-pass-invalid.PNG)




* User Gagal login karena Username invalid dan password valid



![Halaman Login-3](./Screenshot/Test-Case-Detik/Login/username-invalid-password-valid.PNG)





-----------------------------------------------------------------

*Edukasi*


* User memilih Berita berdasarkan Tanggal perilisan berita



![Halaman Edukasi-1](./Screenshot/Test-Case-Detik/Edukasi/Fiter-Tanggal-Perilisan.PNG)


* User memilih berita berdasarkan Tag terpopuler




![Halaman Edukasi-2](./Screenshot/Test-Case-Detik/Edukasi/Tag-Populer.PNG)





* User dapat direct ke halaman Perguruan Tinggi melalu Tagar Perguruan tinggi


![Halaman Login-3](./Screenshot/Test-Case-Detik/Edukasi/Tagar-Perguruan-Tinggi.PNG)





# E-COMMERCE Bhineka.com

Selain Portal Berita Online dilakukan juga Pengujian terhadap E-commerce Bhineka.com. Terdapat 3 Halaman Pengujian dengan masing-masing sebanyak 3 Test Case. Terdapat 9 Test Case yang diuji, namun salah satunya terdapat Bug yang diindikasikan oleh berhasilnya user mengirimkan chat dengan nomor telepon yang salah dimana tidak ada pembatasan untuk digit/karakter nomor telepon. Sehingga Persentase uji website ini sebesar 89% dari 9 Test case, Berikut ini Test Run nya :


![TestRun-Bhineka](./Screenshot/Test-Case-Bhineka/Test-Run-Bhineka.PNG)


**Milestone**


![TestRun-Bhineka](./Screenshot/Test-Case-Bhineka/Milestone.PNG)


## Test Case :

*Riwayat Belanja*


* User mencari barang dengan menggunakan filter list barang pada riwayat belanja




![Halaman Riwayat Belanja-1](./Screenshot/Test-Case-Bhineka/Test-case-riwayat-belanja/Filter-list-barang.PNG)


* User melakukan pembelian ulang dengan menambahkan produk ke keranjang




![Halaman Riwayat Belanja-2](./Screenshot/Test-Case-Bhineka/Test-case-riwayat-belanja/Pembelian-ulang.PNG)




* User direct ke halaman home ketika tidak ada produk di riwayat belanja




![Halaman Riwayat Belanja-3](./Screenshot/Test-Case-Bhineka/Test-case-riwayat-belanja/direct-home.PNG)





---------------------------------------------------------------------------

*Keranjang*


* Ubah Alamat



![Halaman Riwayat Belanja-1](./Screenshot/Test-Case-Bhineka/Test-case-keranjang/Ubah-alamat.PNG)


* melihat Total Pembayaran


![Halaman Keranjang-3](./Screenshot/Test-Case-Bhineka/Test-case-keranjang/Total-Pembayaran.PNG)




* Hapus Semua Barang di keranjang



![Halaman Keranjang-3](./Screenshot/Test-Case-Bhineka/Test-case-keranjang/Hapus-Barang.PNG)





---------------------------------------------------------------------------

*Chat*

* User Chat CS Bhineka Pembelian Personal dengan mengisi field nomor telepon dengan karakter  lebih dari 14


![Halaman Chat-1](./Screenshot/Test-Case-Bhineka/Test-case-chat/field-noTelp-lebih-dari14.PNG)




* User mengakses Chat CS Bhineka Pembelian Korporat tanpa login


![Halaman Chat-2](./Screenshot/Test-Case-Bhineka/Test-case-chat/Pembelian-korporat.PNG)





* Chat CS Bhineka Customer Service tanpa mengisi field 'apa yang bisa kami bantu?'\



![Halaman Chat-3](./Screenshot/Test-Case-Bhineka/Test-case-chat/Chat-tanpa-mengisi-field.PNG)

