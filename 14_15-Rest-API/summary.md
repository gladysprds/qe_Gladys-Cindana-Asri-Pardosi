## Nama : Gladys Cindana Pardosi
## Kelas : B_QE


## Pengenalan RESTful API
==> API adalah singkatan untuk "Application Programming Interface". API memungkinkan komunikasi dan pertukaran. sedangkan REST merupakan singkatan dari ("Representational State Transfer").


## HTTP Response Code :

1. 200 => berarti permintaan telah berhasil.

2. 300 => berarti permintaan dialihkan ke URL lain.

3. 400 => berarti telah terjadi kesalahan yang berasal dari klien.

4. 401 => Unauthorized.

5. 404 => Not Found.

6. 405 => Method not allowed.

7. 500 => Ada kesalahan yang terjadi dan berasal dari server.



## Komponen REST API


===Method-Method dalam API====

**Method GET**

Permintaan ini digunakan untuk mendapatkan sumber daya dari server. Jika melakukan permintaan GET, server mencari data yang Anda minta dan mengirimkannya kembali kepada Anda. Permintaan GET melakukan operasi READ. Ini adalah metode permintaan default.

**Method POST**

Permintaan ini digunakan untuk membuat sumber daya baru di server. Jika Anda melakukan permintaan POST, server membuat entri baru dalam database dan memberi tahu Anda apakah pembuatannya berhasil. Dengan kata lain, permintaan POST` melakukan operasi CREATE.
Method PUT dan PATCH

Kedua permintaan ini digunakan untuk memperbarui sumber daya di server. Jika Anda melakukan permintaan PUT atau PATCH, server memperbarui entri dalam database dan memberi tahu Anda apakah pembaruan berhasil. Dengan kata lain, permintaan PUT atau PATCH melakukan operasi UPDATE.


**Method DELETE**

Permintaan ini digunakan untuk menghapus sumber daya dari server. Jika melakukan permintaan DELETE, server menghapus entri dalam database dan memberi tahu apakah penghapusan yang dilakukan berhasil. Dengan kata lain, permintaan DELETE melakukan operasi hapus.



===Header===

Header digunakan untuk memberikan informasi kepada klien dan server. Header dapat digunakan untuk berbagai tujuan, seperti autentikasi dan memberikan informasi tentang konten isi.


===URL===


URL adalah bagaimana Anda mengidentifikasi hal-hal yang ingin Anda operasikan. Kita katakan bahwa setiap URL mengidentifikasi sumber daya. Ini adalah URL yang sama persis yang ditugaskan untuk halaman web.


===Body====

Data (terkadang disebut “body” atau “message”) berisi informasi yang ingin Anda kirimkan ke server. Opsi ini hanya digunakan dengan  Request POST, PUT, PATCH atau DELETE.


## Jenis API Testing

Functionality : memvalidasi suatu fitur apakah sudah berfungsi atau belum.

Load Test : menguji kekuatan sesuatu sistem apakah mampu mengolah data dari beban yang diberikan.

Security : Menguji keamanan untuk suatu sistem.


TUGAS PRAKTIKUM :

[https://docs.google.com/spreadsheets/d/1Yh9up82LZOc9r3YgtCLxexCWBv5ikJXhgbzk7kdV218/edit?usp=sharing]
