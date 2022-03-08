# NAMA : GLADYS CINDANA PARDOSI
# KELAS: QE_B

## SECTION 09 : BASIC COMMANDS LINUX
### SUMMARY & TASK





* Cal == merupakan perintah linux untuk menampilkan kalender. Berikut ini tampilannya:



![Cal-linux](./Screenshot/cal-pada-Linux.PNG)


Tetapi pada Gitbash perintah ini tidak terdeteksi


![cal](./Screenshot/cal.PNG)




* Date == Merupakan perintah linux untuk menampilkan waktu/jam pada saat dilakukan eksekusi tersebut

![date](./Screenshot/Date.PNG)



## File System Command 


* Touch == merupakan Perintah yang bisa digunakan untuk membuat file baru dengan berbagai jenis format

![Touch](./Screenshot/touch.PNG)



* Cat == merupakan perintah yang digunakan untuk melihat isi dari suatu file,dimana dibawah ini terdapat file notepad_gladys.txt yang berisi "halo gladys!"



![cat](./Screenshot/cat_txt.PNG)




* Cp commands == merupakan perintah yang digunakan untuk melakukan duplikasi terhadap suatu file yang diinginkan dengan format "cp file_kamu"



![cp](./Screenshot/cp.PNG)



* mv commands == merupakan perintah di linux untuk melakukan moving/pemindahan menuju directory lain.


![mv](./Screenshot/mv.PNG)




* rm == merupakan perintah linux yang berasal dari kata remove yang artinya perintah ini digunakan untuk menghapus.


![mv](./Screenshot/rmdir.PNG)




* mkdir == merupakan perintah untuk membuat sebuah folder baru pada directory 



![mkdir](./Screenshot/mkdir.PNG)


* cd command == merupakan command yang digunakan untuk masuk atau keluar ke directory yang diinginkan. ketika masuk, maka formatnya akan menjadi "cd directori_tujuan",namun jika keluar hanya menggunakan command cd saja.


![cd](./Screenshot/cd.PNG)


* pwd command == merupakan perintah yang digunakan untuk melihat directory sekarang



![pwd](./Screenshot/pwd.PNG)





## -----Process Control Commands----

* Top == merupakan command yang digunakan untuk memperlihatkan layar penuh informasi tentang proses yang berjalan pada sistem, serta beberapa informasi keseluruhan tentang system. Pada gitbash,command ini tidak terdeteksi.


![topGitbash](./Screenshot//top.PNG)


 Berikut tampilan pada linux :


![toplinux](./Screenshot/topLinux.PNG)


* Clear == digunakan untuk menghapus isi terminal

![clear](./Screenshot/clear.PNG)


* History == digunakan untuk menampilkan riwayat penggunaan giitbash-nya.

![History](./Screenshot/history.PNG)





## UTILITIES PROGRAM COMMANDS 


* LS == command yang digunakan untuk melihat folder-folder maupun file-file yang terdapat dalam directory sekarang.


![ls](./Screenshot/ls.PNG)



* Which == merupakan perintah yang digunakan untuk menemukan path secara lengkap



![which](./Screenshot/which.PNG)





* Sudo == merupakan command yang sering digunakan pada linux untuk masuk ke suatu hak akses,namun pada gitbash tidak terdapat command ini.




![sudo](./Screenshot/sudo-linux.png)




*Find == merupakan command yang digunakan untuk mencari suatu file




![find](./Screenshot/find.PNG)





## FILE ACCESS PERMISSION

* chmod == Pada File Access permission terdapat perintah chmod yang berfungsi untuk mengganti izin akses terhadap suatu file atau directory. terdapat 3 angka yang menjadi kode di dalamnya ::

4 :r ==read

2 :w ==write

1 :x ==execute

urutan penggunaan :

user-group-other, sehingga apabila kondisinya  user dapat melakukan read-write-execute, group hanya read-write, dan other hanya read, maka kode yang tercipta untuk pengaturan hak akses ini adalah chmod 764 dimana :

7=4+2+1

6=4+2+0

4=4+0+0



Namun pada Gitbash tidak dapat melakukan pergantian hak akses, berikut ini gambarnya :


![find](./Screenshot/chmod-all.PNG)




![find](./Screenshot/chmod.PNG)




* chown == menetapkan hak akses 


![find](./Screenshot/chown.PNG)





## SHELL SCRIPT



* Program 1 :

Pembuatan File dan mengisi File ,sehingga ketika diexecute akan tampil 


![NanoProgram-01](./Screenshot/shell/nano_program01.PNG)



hasilnya :




![Program-01](./Screenshot/shell/program_01.PNG)





* Program 2 :

*read* digunakan untuk memberikan Inputan pada program yang diberikan


![find](./Screenshot/shell/nanoprogram02.PNG)


Hasilnya :


![find](./Screenshot/shell/program02.PNG)




* Program 3 :

Penggunaan parameter dolar ($)


![find](./Screenshot/shell/program03_file.PNG)


Hasilnya :

![find](./Screenshot/shell/program03.PNG)


* Program 4 : 

Program dibawah ini merupakan penggunaan operasi pada shellscript dengan fungsi Let.



![find](./Screenshot/shell/program_04.PNG)


Hasilnya :

![find](./Screenshot/shell/04_1.PNG)



![find](./Screenshot/shell/04_2.PNG)



* Program 5 :

Deklarasi dan pencetakan variabel menggunakan fungsi Echo


![find](./Screenshot/shell/program05.PNG)




![find](./Screenshot/shell/program05_2.PNG)