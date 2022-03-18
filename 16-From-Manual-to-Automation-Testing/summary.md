## Manual Testing dan Automation Test

Manual Testing merupakan pengujian untuk menemukan cacat berupa bug dalam suatu
sistem yang dilakukan dengan cara manual. Manual berarti, pengujian langsung
dilakukan oleh Tester yang tanpa bantuan dari Automation Tools. Manual Testing 
pada umumnya dilakukan untuk pengujian Visual atau UI UX nya dimana manual Testing
Tester berperan sebagai End User.  

Kelebihan Manual Testing :

1. Automation Tools tidak dapat memberikan feedback mengenai Tampilan UI

2. Jika pengujian dilakukan sederhana, maka manual tetsing tidak perlu
menggunakan automation tools yang mahal

3. Bisa mendapatkan feedback langsung tentang apa yang diinginkan dan 
tidak diinginkan 

Kekurangan Manual Testing :

1. Human error yang tidak bisa dihindari

2. Jika banyak perubahan ,maka harus melakukan pengujian dari awal

3. Akibat seringnya menguji suatu software secara terus menerus,maka muncul
efek kelelahan pada tester sehingga melewatkan beberapa kesalahan.


Automation Testing

==> Kebalikan dari manual testing,automation testing dilakukan menggunakan Alat/ Tools 
Automasi untuk melakukan pengujian terhadap suatu software.

Kelebihan :
1. Lebih banyak menemukan bug dibanding Tester manual
2. Lebih cepat dan memiliki efisiensi yang besar dibandingkan Manual testing
karena Automation testing dijalankan dengan menggunakan Script dan Tools otomatis, sehingga untuk
melakukan suatu pengujian waktu yang digunakan lebih singkat

3. Test dapat dilakukan berulang dengan koding yang dapat diupdate secara berkala
(Regression Testing )


kekurangan :
1. Lebih mahal
2. Kurang Human element
3. tidak Ada feedback dari visual software

Mengapa Automation Testing penting ?
* Apabila kita melakukan testing manual dari seluruh bidang maka akan lebih banyak
menggunakan biaya.

* Sulit menguji Situs multibahasa secara manual

* Tidak memerlukan campur tangan manusia,karena sudah adanya bantuan dari
script dan Automation testing.

* meningkatkan kecepatan dari eksekusi test

* membantu meningkatkan scope dari sebuah test


Ciri-ciri test case yang dapat di automasi :
1. Test case yang di execute berulang kali

2. Test Case yang sulit dilakukan secara manual

3. Test Case yang dilakukan namun membutuhkan waktu yang lama 


Ciri-ciri test case yang tidak dapat diautomasi :

1. Test case yang baru dirancang dan belum pernah dilakukan pengujian

2. Test Case yang sering memiliki requirement berubah-ubah



## Define Scope Of Automation 

*  Fitur yang penting untuk bisnis

*  Scenario yang memiliki banyak data 

*  Fungsionalitas Umum di aplikasi

* Kelayakan Teknis

* Sejauh mana komponen bisnis digunakan kembali



## AUTOMATION BEST PRACTICE

1. Scope of Automation == pentingnya menentukan Cakupan dari pembuatan
test case secara otomatis(menggunakan script dan tools)

2. Pilih Tools yang sesuai, tidak boleh hanya berdasarkan popularitasnya saja

3.  Memilih Framework yang sesuai

4. Scripting standards(pembuatan script,komen,dll)

5. Error message yang diberikan ke user harus di standarisasi

6. Tidak dapat membandingkan automation testing dan Manual testing,
tapi juga memperhatikan persentase bug yang ditemukan ketika automation.





===== TASK 1 =====

1. Pengujian File dilakukan pada File Sampel-Rest API Testing yang mempunyai fitur CRUD(Create,Read,Update,Delete) pada sistemnya.
   Ketika melakukan pengujian pada setiap fiturnya,ternyata untuk melakukan pengeksekusian pada setiap fitur waktu yang dibutuhkan berbeda
   Pada gambar tersebut merupakan laporan pengujian file Sample_REST_API_Testing.feature memiliki fitur sebagai melakukan operasi CRUD. 
   Pada gambar terdapat method Create, Read, Update, Delete yang memiliki wakktu respon yang berbeda beda dalam menjalankan method tersebut. 
   Response Time Testing mengukur waktu yang dibutuhkan untuk sistem untuk menanggapi permintaan yang lain. Respon time adalah waktu 
   yang dibutuhkan sistem untuk mencapai input tertentu sampai proses selesai.Ketika melakukan eksekusi pada method Get waktu yang dibutuhkan 212,
   method Update waktu yang dibutuhkan 764ms, method post dibutuhkan 786 ms dan 880 ms untuk method delete.Dalam pengujian ini, 
   method yang paling sedikit membutuhkan waktu adalah metode get dimana fungsinya hanya menampilkan.

2. Terdapat 3 Scenario yaitu Petstor,Search,Shopping cart yang memiliki jumlah test masing masing secara berurut 1,4,2. Report keberhasilan dari setiap
   scenario ini adalah petstore yang memiliki 1 Test berhasil 100%, Seearch terdapat 4 Test yang di ana 3 Test nya berhasil dilewati dan 1 test case lagi 
   masih belum di test atau terjadi penundaan pengujian, dan yang terakhir Shopping cart memiliki 2 Test case dimana hanya satu test case yang berhasil 
	memenuhi syarat(Passed) , namun terdapat 1 test case yang failed.






















































