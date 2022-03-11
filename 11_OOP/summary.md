# Object Oriented Programming

## Resume

- *OOP* adalah singkatan dari *Object Oriented Programming*, yaitu suatu metode pemrograman yang fokus atau berorientasi pada objek. Tujuan dari dirancangnya OOP adalah membantu para developer dalam mengembangkan model yang sudah ada di kehidupan sehari-hari.

1. Object
   
   - Objek adalah instance dari kelas yang dibuat dengan data yang ditentukan secara khusus. Objek dapat sesuai dengan objek dunia nyata atau entitas abstrak. Ketika kelas didefinisikan pada awalnya, deskripsi adalah satu-satunya objek yang didefinisikan.
  
   - Declaration : mendeklarasikan nama sebuah obyek
  
   - Instantiation : memerlukan sebuah perintah new untuk menciptakan obyek
  
   - Initialization : inisialisasi dari sebuah obyek setelah perintah new

2. Inheritance
   
   - Inheritance dalam konsep OOP adalah kemampuan untuk membentuk class baru yang memiliki fungsi turunan atau mirip dengan fungsi yang ada sebelumnya. Kelas dapat menggunakan kembali kode dari kelas lain. Hubungan dan subkelas antar objek dapat ditetapkan, memungkinkan pengembang menggunakan kembali logika umum sambil tetap mempertahankan hierarki unik. Properti OOP ini memaksa analisis data yang lebih menyeluruh, mengurangi waktu pengembangan, dan memastikan tingkat akurasi yang lebih tinggi.

   
3. Encapsulation

   - Prinsip ini menyatakan bahwa semua informasi penting terkandung di dalam suatu objek dan hanya informasi tertentu yang terpapar. Implementasi dan status setiap objek disimpan secara pribadi di dalam kelas yang ditentukan. Objek lain tidak memiliki akses ke kelas ini atau otoritas untuk membuat perubahan. Mereka hanya dapat memanggil daftar fungsi atau metode publik. Karakteristik penyembunyian data ini memberikan keamanan program yang lebih besar dan menghindari kerusakan data yang tidak diinginkan.
   
4. Abstraction
   
   - abstraction berarti menyembunyikan detail latar belakang dan hanya mewakili informasi yang diperlukan untuk dunia luar. Ini adalah proses penyederhanaan konsep dunia nyata menjadi komponen yang mutlak diperlukan. Seperti kala menggunakan handphone, kamu cukup memberikan suatu perintah, tanpa tahu bagaimana proses terlaksananya perintah tersebut.
   
5. Polymorphism
   
   - polymorphism adalah kemampuan suatu pesan atau data untuk diproses lebih dari satu bentuk. Polymorphism sendiri adalah konsep di mana suatu objek yang berbeda-beda dapat diakses melalui interface yang sama.

   - Sebagai contoh, kamu memiliki fungsi untuk menghitung luas suatu benda, sementara benda tersebut berbentuk segitiga, lingkaran, dan persegi yang memiliki rumus perhitungan tersendiri. Dengan polymorphism, dapat memasukkan fungsi perhitungan luas ke tiga benda tersebut, dengan tiap benda memiliki metode perhitungannya sendiri. Ini tentu akan mempermudah perintah yang sama untuk beberapa class atau subclass tertentu. 
   
6. Atrribute
   
   - Atribut didefinisikan dalam template kelas dan mewakili keadaan suatu objek. Objek akan memiliki data yang disimpan di bidang atribut. Atribut kelas milik kelas itu sendiri.
   
7. Method
   
   - Metode adalah fungsi yang didefinisikan di dalam kelas yang menggambarkan perilaku suatu objek. Setiap metode yang terkandung dalam definisi kelas dimulai dengan referensi ke objek instance.

   - Metode di dalam kelas adalah block statement yang memiliki nama dan bisa dieksekusi dengan memanggilnya. Pemanggilan metode biasa disebut dengan “invoke”.
  
8. Class
   
   - Class merupakan bagian dari turunan obyek yang berfungsi sebagai wadah atau cetakan untuk mendeskripsikan behavior/state yang didukung obyeknya. Behavior adalah tingkah laku yang dapat dilakukan oleh obyek. Pengertian Kelas yang lain adalah tipe data yang ditentukan pengguna yang bertindak sebagai cetak biru untuk objek, atribut, dan metode individual.


*Access Modifier*

- Public : Access modifier public bisa kita sebut sebagai modifier global. Artinya bisa diakses dari manapun bahkan package yang berbeda.

- Default : Default modifier berarti penulisan kodenya tanpa atribut modifier. Ini berlaku untuk semua kelas, member, atau fungsi yang kita tuliskan tanpa access modifier. Modifier default bisa diakses selama masih dalam satu package.

- Private : Access modifier private akan membatasi akses hanya di dalam class. Private biasanya digunakan sebagai modifier dari member dan metode suatu class.

- Protected : Access modifier protected bisa diakses selama masih dalam satu package. Protected memiliki sedikit perbedaan dengan default modifier. Perbedaannya adalah protected bisa diakses dari luar package. Akan tetapi, satu-satunya cara untuk akses dari luar package adalah kelas yang hendak mengakses, merupakan kelas turunannya.